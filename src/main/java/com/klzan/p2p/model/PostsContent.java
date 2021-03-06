package com.klzan.p2p.model;

import com.klzan.core.util.StringUtils;
import com.klzan.p2p.enums.PostsContentModule;
import com.klzan.p2p.enums.PostsContentStatus;
import com.klzan.p2p.model.base.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 内容表
 * 用于存放比如文章、帖子、商品、问答等用户自定义模型内容。也用来存放比如菜单、购物车、消费记录等系统模型
 * Created by Sue on 2017/5/28.
 */
@Entity
@Table(name = "karazam_posts_content")
public class PostsContent extends BaseModel {
    /**
     * 标题
     */
    private String title;
    /**
     * 内容描述
     */
    private String text;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 连接到(常用于谋文章只是一个连接)
     */
    private String linkTo;
    /**
     * 是否启用markdown
     */
    private Boolean markdownEnable;
    /**
     * 缩略图缩略图
     */
    private String thumbnail;
    /**
     * 模型
     */
    private String module = PostsContentModule.ARTICLE.name();
    /**
     * 样式
     */
    private String style;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 匿名稿的用户
     */
    private String author;
    /**
     * 匿名稿的邮箱
     */
    private String userEmail;
    /**
     * IP地址
     */
    private String userIp;
    /**
     * 发布浏览agent
     */
    private String userAgent;
    /**
     * 父级内容ID
     */
    private Integer parentId;
    /**
     * 关联的对象ID
     */
    private Integer objectId;
    /**
     * 排序编号
     */
    private Integer orderNumber = 0;
    /**
     * 状态
     */
    private String status = PostsContentStatus.DRAFT.name();
    /**
     * 支持人数
     */
    private Integer voteUp = 0;
    /**
     * 反对人数
     */
    private Integer voteDown = 0;
    /**
     * 评分分数
     */
    private BigDecimal rate = BigDecimal.ZERO;
    /**
     * 评分次数
     */
    private Integer rateCount = 0;
    /**
     * 评论状态
     */
    private Boolean commentStatus = false;
    /**
     * 评论总数
     */
    private Integer commentCount = 0;
    /**
     * 最后评论时间
     */
    private Date commentTime;
    /**
     * 访问量
     */
    private Integer viewCount = 0;
    /**
     * slug
     */
    private String slug;
    /**
     * 标识
     */
    private String flag;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 经度
     */
    private String lng;
    /**
     * SEO关键字
     */
    private String metaKeywords;
    /**
     * SEO描述内容
     */
    private String metaDescription;
    /**
     * 备注信息
     */
    private String remarks;
    /**
     * 模板
     */
    private String template;
    /**
     * 过期时间
     */
    private Date expire;

    // 临时信息
    @Transient
    private Integer categoryId;
    @Transient
    private String category;
    @Transient
    private String categoryDes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLinkTo() {
        return linkTo;
    }

    public void setLinkTo(String linkTo) {
        this.linkTo = linkTo;
    }

    public Boolean getMarkdownEnable() {
        return markdownEnable;
    }

    public void setMarkdownEnable(Boolean markdownEnable) {
        this.markdownEnable = markdownEnable;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(Integer voteUp) {
        this.voteUp = voteUp;
    }

    public Integer getVoteDown() {
        return voteDown;
    }

    public void setVoteDown(Integer voteDown) {
        this.voteDown = voteDown;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getRateCount() {
        return rateCount;
    }

    public void setRateCount(Integer rateCount) {
        this.rateCount = rateCount;
    }

    public Boolean getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Boolean commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryDes() {
        return categoryDes;
    }

    public void setCategoryDes(String categoryDes) {
        this.categoryDes = categoryDes;
    }

    @Transient
    public String getStatusDes() {
        try {
            if (StringUtils.isNotBlank(getStatus())) {
                return PostsContentStatus.valueOf(status).getDisplayName();
            }
        } catch (IllegalArgumentException e) {
        }
        return "";
    }
}
