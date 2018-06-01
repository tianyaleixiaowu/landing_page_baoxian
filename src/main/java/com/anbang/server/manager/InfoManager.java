package com.anbang.server.manager;

import com.anbang.server.bean.InfoListData;
import com.anbang.server.bean.SimplePage;
import com.anbang.server.model.Info;
import com.anbang.server.repository.InfoRepository;
import com.anbang.server.requestbody.InfoQuery;
import com.anbang.server.specify.Criteria;
import com.anbang.server.specify.LogicalExpression;
import com.anbang.server.specify.Restrictions;
import com.anbang.server.util.CommonUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@Service
public class InfoManager {
    @Resource
    private InfoRepository infoRepository;
    @Resource
    private ChannelManager channelManager;

    public Info save(Info info) {
        if (existMobile(info.getPhone())) {
            return null;
        }
        return infoRepository.save(info);
    }

    /**
     * 条件查询
     *
     * @param infoQuery
     *         infoQuery
     * @return 数据集
     */
    public InfoListData query(InfoQuery infoQuery) {
        InfoListData infoListData = new InfoListData();
        if (StringUtils.isEmpty(infoQuery.getBegin()) || StringUtils.isEmpty(infoQuery.getEnd())) {
            infoListData.setCode(-1);
            infoListData.setMessage("起始结束时间不能为空");
        } else {
            Map<String, String> channels = channelManager.findName();
            Page<Info> infos = queryPage(infoQuery);
            List<Info> infoList = infos.getContent();
            for (Info info : infoList) {
                info.setChannel(channels.get(info.getChannel()));
            }
            SimplePage<Info> simplePage = new SimplePage<>(infos.getTotalPages(), infos.getTotalElements(), infoList);

            infoListData.setCode(0);
            infoListData.setSimplePage(simplePage);
        }
        return infoListData;
    }

    //public List<InfoExcel> excel(InfoQuery infoQuery) {
    //    List<Info> infos = queryPage(infoQuery).getContent();
    //    List<InfoExcel> list = new ArrayList<>();
    //    for (Info info : infos) {
    //        InfoExcel infoExcel = new InfoExcel();
    //        BeanUtils.copyProperties(info, infoExcel);
    //        list.add(infoExcel);
    //    }
    //    return list;
    //}

    private Page<Info> queryPage(InfoQuery infoQuery) {
        Criteria<Info> criteria = new Criteria<>();
        //开始时间
        Date begin = CommonUtil.dateOfStr(infoQuery.getBegin());
        criteria.add(Restrictions.gt("createTime", begin, true));
        Date end = CommonUtil.dateOfStr(infoQuery.getEnd());
        criteria.add(Restrictions.lt("createTime", end, true));

        List<String> channels = infoQuery.getChannels();
        String channelsStr = infoQuery.getChannelsStr();
        if (channelsStr != null) {
            String[] cc = channelsStr.split(",");
            channels = new ArrayList<>(Arrays.asList(cc));
        }
        //if(channels != null && channels.size() > 0) {
        //    LogicalExpression[] logicalExpressionList = new LogicalExpression[channels.size()];
        //    for (int i = 0; i < logicalExpressionList.length; i++) {
        //        ChannelBean channelBean = channels.get(i);
        //        SimpleExpression s1 = Restrictions.eq("original", channelBean.getOriginal(), true);
        //        LogicalExpression s2 = Restrictions.in("channel", channelBean.getChannel(), true);
        //
        //        LogicalExpression one = Restrictions.and(s1, s2);
        //        logicalExpressionList[i] = one;
        //    }
        //    criteria.add(Restrictions.or(logicalExpressionList));
        //}

        if (channels != null && channels.size() > 0) {
            LogicalExpression s2 = Restrictions.in("channel", channels, true);
            criteria.add(s2);
        } else {
            criteria.add(Restrictions.ne("channel", "test", true));
        }

        int page = 0;
        if (infoQuery.getPage() != null) {
            page = infoQuery.getPage();
        }
        int size = 10;
        if (infoQuery.getSize() != null) {
            size = infoQuery.getSize();
        }
        Sort.Direction direction = Sort.Direction.DESC;
        Sort sort = new Sort(direction, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        return infoRepository.findAll(criteria, pageable);
    }

    /**
     * 是否已存在的手机号
     *
     * @param mobile
     *         mobile
     * @return 是否已存在
     */
    public boolean existMobile(String mobile) {
        return infoRepository.findByPhone(mobile).size() > 0;
    }

}
