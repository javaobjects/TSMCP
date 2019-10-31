package com.tencent.tsmcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TsmcpPermitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsmcpPermitExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andPermitNameIsNull() {
            addCriterion("permit_name is null");
            return (Criteria) this;
        }

        public Criteria andPermitNameIsNotNull() {
            addCriterion("permit_name is not null");
            return (Criteria) this;
        }

        public Criteria andPermitNameEqualTo(String value) {
            addCriterion("permit_name =", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotEqualTo(String value) {
            addCriterion("permit_name <>", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameGreaterThan(String value) {
            addCriterion("permit_name >", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameGreaterThanOrEqualTo(String value) {
            addCriterion("permit_name >=", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLessThan(String value) {
            addCriterion("permit_name <", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLessThanOrEqualTo(String value) {
            addCriterion("permit_name <=", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLike(String value) {
            addCriterion("permit_name like", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotLike(String value) {
            addCriterion("permit_name not like", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameIn(List<String> values) {
            addCriterion("permit_name in", values, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotIn(List<String> values) {
            addCriterion("permit_name not in", values, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameBetween(String value1, String value2) {
            addCriterion("permit_name between", value1, value2, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotBetween(String value1, String value2) {
            addCriterion("permit_name not between", value1, value2, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitDescIsNull() {
            addCriterion("permit_desc is null");
            return (Criteria) this;
        }

        public Criteria andPermitDescIsNotNull() {
            addCriterion("permit_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPermitDescEqualTo(String value) {
            addCriterion("permit_desc =", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescNotEqualTo(String value) {
            addCriterion("permit_desc <>", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescGreaterThan(String value) {
            addCriterion("permit_desc >", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescGreaterThanOrEqualTo(String value) {
            addCriterion("permit_desc >=", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescLessThan(String value) {
            addCriterion("permit_desc <", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescLessThanOrEqualTo(String value) {
            addCriterion("permit_desc <=", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescLike(String value) {
            addCriterion("permit_desc like", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescNotLike(String value) {
            addCriterion("permit_desc not like", value, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescIn(List<String> values) {
            addCriterion("permit_desc in", values, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescNotIn(List<String> values) {
            addCriterion("permit_desc not in", values, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescBetween(String value1, String value2) {
            addCriterion("permit_desc between", value1, value2, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitDescNotBetween(String value1, String value2) {
            addCriterion("permit_desc not between", value1, value2, "permitDesc");
            return (Criteria) this;
        }

        public Criteria andPermitPathIsNull() {
            addCriterion("permit_path is null");
            return (Criteria) this;
        }

        public Criteria andPermitPathIsNotNull() {
            addCriterion("permit_path is not null");
            return (Criteria) this;
        }

        public Criteria andPermitPathEqualTo(String value) {
            addCriterion("permit_path =", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathNotEqualTo(String value) {
            addCriterion("permit_path <>", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathGreaterThan(String value) {
            addCriterion("permit_path >", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathGreaterThanOrEqualTo(String value) {
            addCriterion("permit_path >=", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathLessThan(String value) {
            addCriterion("permit_path <", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathLessThanOrEqualTo(String value) {
            addCriterion("permit_path <=", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathLike(String value) {
            addCriterion("permit_path like", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathNotLike(String value) {
            addCriterion("permit_path not like", value, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathIn(List<String> values) {
            addCriterion("permit_path in", values, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathNotIn(List<String> values) {
            addCriterion("permit_path not in", values, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathBetween(String value1, String value2) {
            addCriterion("permit_path between", value1, value2, "permitPath");
            return (Criteria) this;
        }

        public Criteria andPermitPathNotBetween(String value1, String value2) {
            addCriterion("permit_path not between", value1, value2, "permitPath");
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