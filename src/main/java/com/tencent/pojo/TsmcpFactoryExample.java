package com.tencent.tsmcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TsmcpFactoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsmcpFactoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNull() {
            addCriterion("create_userid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNotNull() {
            addCriterion("create_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridEqualTo(Integer value) {
            addCriterion("create_userid =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(Integer value) {
            addCriterion("create_userid <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(Integer value) {
            addCriterion("create_userid >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_userid >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(Integer value) {
            addCriterion("create_userid <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(Integer value) {
            addCriterion("create_userid <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<Integer> values) {
            addCriterion("create_userid in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<Integer> values) {
            addCriterion("create_userid not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(Integer value1, Integer value2) {
            addCriterion("create_userid between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("create_userid not between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIsNull() {
            addCriterion("update_userid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIsNotNull() {
            addCriterion("update_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridEqualTo(Integer value) {
            addCriterion("update_userid =", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotEqualTo(Integer value) {
            addCriterion("update_userid <>", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThan(Integer value) {
            addCriterion("update_userid >", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_userid >=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThan(Integer value) {
            addCriterion("update_userid <", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThanOrEqualTo(Integer value) {
            addCriterion("update_userid <=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIn(List<Integer> values) {
            addCriterion("update_userid in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotIn(List<Integer> values) {
            addCriterion("update_userid not in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridBetween(Integer value1, Integer value2) {
            addCriterion("update_userid between", value1, value2, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("update_userid not between", value1, value2, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andBakIsNull() {
            addCriterion("bak is null");
            return (Criteria) this;
        }

        public Criteria andBakIsNotNull() {
            addCriterion("bak is not null");
            return (Criteria) this;
        }

        public Criteria andBakEqualTo(String value) {
            addCriterion("bak =", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotEqualTo(String value) {
            addCriterion("bak <>", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakGreaterThan(String value) {
            addCriterion("bak >", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakGreaterThanOrEqualTo(String value) {
            addCriterion("bak >=", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakLessThan(String value) {
            addCriterion("bak <", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakLessThanOrEqualTo(String value) {
            addCriterion("bak <=", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakLike(String value) {
            addCriterion("bak like", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotLike(String value) {
            addCriterion("bak not like", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakIn(List<String> values) {
            addCriterion("bak in", values, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotIn(List<String> values) {
            addCriterion("bak not in", values, "bak");
            return (Criteria) this;
        }

        public Criteria andBakBetween(String value1, String value2) {
            addCriterion("bak between", value1, value2, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotBetween(String value1, String value2) {
            addCriterion("bak not between", value1, value2, "bak");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlIsNull() {
            addCriterion("factory_img_url is null");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlIsNotNull() {
            addCriterion("factory_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlEqualTo(String value) {
            addCriterion("factory_img_url =", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlNotEqualTo(String value) {
            addCriterion("factory_img_url <>", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlGreaterThan(String value) {
            addCriterion("factory_img_url >", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("factory_img_url >=", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlLessThan(String value) {
            addCriterion("factory_img_url <", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlLessThanOrEqualTo(String value) {
            addCriterion("factory_img_url <=", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlLike(String value) {
            addCriterion("factory_img_url like", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlNotLike(String value) {
            addCriterion("factory_img_url not like", value, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlIn(List<String> values) {
            addCriterion("factory_img_url in", values, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlNotIn(List<String> values) {
            addCriterion("factory_img_url not in", values, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlBetween(String value1, String value2) {
            addCriterion("factory_img_url between", value1, value2, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryImgUrlNotBetween(String value1, String value2) {
            addCriterion("factory_img_url not between", value1, value2, "factoryImgUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrIsNull() {
            addCriterion("factory_addr is null");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrIsNotNull() {
            addCriterion("factory_addr is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrEqualTo(String value) {
            addCriterion("factory_addr =", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrNotEqualTo(String value) {
            addCriterion("factory_addr <>", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrGreaterThan(String value) {
            addCriterion("factory_addr >", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrGreaterThanOrEqualTo(String value) {
            addCriterion("factory_addr >=", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrLessThan(String value) {
            addCriterion("factory_addr <", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrLessThanOrEqualTo(String value) {
            addCriterion("factory_addr <=", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrLike(String value) {
            addCriterion("factory_addr like", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrNotLike(String value) {
            addCriterion("factory_addr not like", value, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrIn(List<String> values) {
            addCriterion("factory_addr in", values, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrNotIn(List<String> values) {
            addCriterion("factory_addr not in", values, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrBetween(String value1, String value2) {
            addCriterion("factory_addr between", value1, value2, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryAddrNotBetween(String value1, String value2) {
            addCriterion("factory_addr not between", value1, value2, "factoryAddr");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlIsNull() {
            addCriterion("factory_url is null");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlIsNotNull() {
            addCriterion("factory_url is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlEqualTo(String value) {
            addCriterion("factory_url =", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlNotEqualTo(String value) {
            addCriterion("factory_url <>", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlGreaterThan(String value) {
            addCriterion("factory_url >", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("factory_url >=", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlLessThan(String value) {
            addCriterion("factory_url <", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlLessThanOrEqualTo(String value) {
            addCriterion("factory_url <=", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlLike(String value) {
            addCriterion("factory_url like", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlNotLike(String value) {
            addCriterion("factory_url not like", value, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlIn(List<String> values) {
            addCriterion("factory_url in", values, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlNotIn(List<String> values) {
            addCriterion("factory_url not in", values, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlBetween(String value1, String value2) {
            addCriterion("factory_url between", value1, value2, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryUrlNotBetween(String value1, String value2) {
            addCriterion("factory_url not between", value1, value2, "factoryUrl");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerIsNull() {
            addCriterion("factory_worker is null");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerIsNotNull() {
            addCriterion("factory_worker is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerEqualTo(Integer value) {
            addCriterion("factory_worker =", value, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerNotEqualTo(Integer value) {
            addCriterion("factory_worker <>", value, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerGreaterThan(Integer value) {
            addCriterion("factory_worker >", value, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_worker >=", value, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerLessThan(Integer value) {
            addCriterion("factory_worker <", value, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerLessThanOrEqualTo(Integer value) {
            addCriterion("factory_worker <=", value, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerIn(List<Integer> values) {
            addCriterion("factory_worker in", values, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerNotIn(List<Integer> values) {
            addCriterion("factory_worker not in", values, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerBetween(Integer value1, Integer value2) {
            addCriterion("factory_worker between", value1, value2, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryWorkerNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_worker not between", value1, value2, "factoryWorker");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIsNull() {
            addCriterion("factory_status is null");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIsNotNull() {
            addCriterion("factory_status is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusEqualTo(Integer value) {
            addCriterion("factory_status =", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotEqualTo(Integer value) {
            addCriterion("factory_status <>", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusGreaterThan(Integer value) {
            addCriterion("factory_status >", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_status >=", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusLessThan(Integer value) {
            addCriterion("factory_status <", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("factory_status <=", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIn(List<Integer> values) {
            addCriterion("factory_status in", values, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotIn(List<Integer> values) {
            addCriterion("factory_status not in", values, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("factory_status between", value1, value2, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_status not between", value1, value2, "factoryStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}