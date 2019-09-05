package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRNumIsNull() {
            addCriterion("R_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRNumIsNotNull() {
            addCriterion("R_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRNumEqualTo(Integer value) {
            addCriterion("R_NUM =", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotEqualTo(Integer value) {
            addCriterion("R_NUM <>", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumGreaterThan(Integer value) {
            addCriterion("R_NUM >", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_NUM >=", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumLessThan(Integer value) {
            addCriterion("R_NUM <", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumLessThanOrEqualTo(Integer value) {
            addCriterion("R_NUM <=", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumIn(List<Integer> values) {
            addCriterion("R_NUM in", values, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotIn(List<Integer> values) {
            addCriterion("R_NUM not in", values, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumBetween(Integer value1, Integer value2) {
            addCriterion("R_NUM between", value1, value2, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotBetween(Integer value1, Integer value2) {
            addCriterion("R_NUM not between", value1, value2, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNameIsNull() {
            addCriterion("R_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("R_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("R_NAME =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("R_NAME <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("R_NAME >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("R_NAME >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("R_NAME <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("R_NAME <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("R_NAME like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("R_NAME not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("R_NAME in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("R_NAME not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("R_NAME between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("R_NAME not between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRRemarksIsNull() {
            addCriterion("R_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRRemarksIsNotNull() {
            addCriterion("R_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRRemarksEqualTo(String value) {
            addCriterion("R_REMARKS =", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotEqualTo(String value) {
            addCriterion("R_REMARKS <>", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksGreaterThan(String value) {
            addCriterion("R_REMARKS >", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("R_REMARKS >=", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksLessThan(String value) {
            addCriterion("R_REMARKS <", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksLessThanOrEqualTo(String value) {
            addCriterion("R_REMARKS <=", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksLike(String value) {
            addCriterion("R_REMARKS like", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotLike(String value) {
            addCriterion("R_REMARKS not like", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksIn(List<String> values) {
            addCriterion("R_REMARKS in", values, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotIn(List<String> values) {
            addCriterion("R_REMARKS not in", values, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksBetween(String value1, String value2) {
            addCriterion("R_REMARKS between", value1, value2, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotBetween(String value1, String value2) {
            addCriterion("R_REMARKS not between", value1, value2, "rRemarks");
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