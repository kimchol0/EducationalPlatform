package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayExample() {
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

        public Criteria andPayNumIsNull() {
            addCriterion("PAY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNotNull() {
            addCriterion("PAY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumEqualTo(Integer value) {
            addCriterion("PAY_NUM =", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotEqualTo(Integer value) {
            addCriterion("PAY_NUM <>", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThan(Integer value) {
            addCriterion("PAY_NUM >", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_NUM >=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThan(Integer value) {
            addCriterion("PAY_NUM <", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_NUM <=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumIn(List<Integer> values) {
            addCriterion("PAY_NUM in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotIn(List<Integer> values) {
            addCriterion("PAY_NUM not in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumBetween(Integer value1, Integer value2) {
            addCriterion("PAY_NUM between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_NUM not between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andPayTextIsNull() {
            addCriterion("PAY_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andPayTextIsNotNull() {
            addCriterion("PAY_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPayTextEqualTo(Integer value) {
            addCriterion("PAY_TEXT =", value, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextNotEqualTo(Integer value) {
            addCriterion("PAY_TEXT <>", value, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextGreaterThan(Integer value) {
            addCriterion("PAY_TEXT >", value, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_TEXT >=", value, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextLessThan(Integer value) {
            addCriterion("PAY_TEXT <", value, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_TEXT <=", value, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextIn(List<Integer> values) {
            addCriterion("PAY_TEXT in", values, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextNotIn(List<Integer> values) {
            addCriterion("PAY_TEXT not in", values, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TEXT between", value1, value2, "payText");
            return (Criteria) this;
        }

        public Criteria andPayTextNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TEXT not between", value1, value2, "payText");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("PAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("PAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("PAY_DATE =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("PAY_DATE <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("PAY_DATE >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_DATE >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("PAY_DATE <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("PAY_DATE <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("PAY_DATE in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("PAY_DATE not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("PAY_DATE between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("PAY_DATE not between", value1, value2, "payDate");
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