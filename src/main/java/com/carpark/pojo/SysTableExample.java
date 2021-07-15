package com.carpark.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTableExample() {
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

        public Criteria andSysIdIsNull() {
            addCriterion("sys_id is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(Integer value) {
            addCriterion("sys_id =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(Integer value) {
            addCriterion("sys_id <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(Integer value) {
            addCriterion("sys_id >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_id >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(Integer value) {
            addCriterion("sys_id <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_id <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<Integer> values) {
            addCriterion("sys_id in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<Integer> values) {
            addCriterion("sys_id not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_id between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_id not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyIsNull() {
            addCriterion("sys_hourMoney is null");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyIsNotNull() {
            addCriterion("sys_hourMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyEqualTo(Integer value) {
            addCriterion("sys_hourMoney =", value, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyNotEqualTo(Integer value) {
            addCriterion("sys_hourMoney <>", value, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyGreaterThan(Integer value) {
            addCriterion("sys_hourMoney >", value, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_hourMoney >=", value, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyLessThan(Integer value) {
            addCriterion("sys_hourMoney <", value, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("sys_hourMoney <=", value, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyIn(List<Integer> values) {
            addCriterion("sys_hourMoney in", values, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyNotIn(List<Integer> values) {
            addCriterion("sys_hourMoney not in", values, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyBetween(Integer value1, Integer value2) {
            addCriterion("sys_hourMoney between", value1, value2, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysHourmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_hourMoney not between", value1, value2, "sysHourmoney");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeIsNull() {
            addCriterion("sys_freeTime is null");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeIsNotNull() {
            addCriterion("sys_freeTime is not null");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeEqualTo(String value) {
            addCriterion("sys_freeTime =", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeNotEqualTo(String value) {
            addCriterion("sys_freeTime <>", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeGreaterThan(String value) {
            addCriterion("sys_freeTime >", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_freeTime >=", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeLessThan(String value) {
            addCriterion("sys_freeTime <", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeLessThanOrEqualTo(String value) {
            addCriterion("sys_freeTime <=", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeLike(String value) {
            addCriterion("sys_freeTime like", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeNotLike(String value) {
            addCriterion("sys_freeTime not like", value, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeIn(List<String> values) {
            addCriterion("sys_freeTime in", values, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeNotIn(List<String> values) {
            addCriterion("sys_freeTime not in", values, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeBetween(String value1, String value2) {
            addCriterion("sys_freeTime between", value1, value2, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysFreetimeNotBetween(String value1, String value2) {
            addCriterion("sys_freeTime not between", value1, value2, "sysFreetime");
            return (Criteria) this;
        }

        public Criteria andSysStateIsNull() {
            addCriterion("sys_state is null");
            return (Criteria) this;
        }

        public Criteria andSysStateIsNotNull() {
            addCriterion("sys_state is not null");
            return (Criteria) this;
        }

        public Criteria andSysStateEqualTo(Integer value) {
            addCriterion("sys_state =", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateNotEqualTo(Integer value) {
            addCriterion("sys_state <>", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateGreaterThan(Integer value) {
            addCriterion("sys_state >", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_state >=", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateLessThan(Integer value) {
            addCriterion("sys_state <", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateLessThanOrEqualTo(Integer value) {
            addCriterion("sys_state <=", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateIn(List<Integer> values) {
            addCriterion("sys_state in", values, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateNotIn(List<Integer> values) {
            addCriterion("sys_state not in", values, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateBetween(Integer value1, Integer value2) {
            addCriterion("sys_state between", value1, value2, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_state not between", value1, value2, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysMonthIsNull() {
            addCriterion("sys_month is null");
            return (Criteria) this;
        }

        public Criteria andSysMonthIsNotNull() {
            addCriterion("sys_month is not null");
            return (Criteria) this;
        }

        public Criteria andSysMonthEqualTo(Long value) {
            addCriterion("sys_month =", value, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthNotEqualTo(Long value) {
            addCriterion("sys_month <>", value, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthGreaterThan(Long value) {
            addCriterion("sys_month >", value, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_month >=", value, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthLessThan(Long value) {
            addCriterion("sys_month <", value, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthLessThanOrEqualTo(Long value) {
            addCriterion("sys_month <=", value, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthIn(List<Long> values) {
            addCriterion("sys_month in", values, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthNotIn(List<Long> values) {
            addCriterion("sys_month not in", values, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthBetween(Long value1, Long value2) {
            addCriterion("sys_month between", value1, value2, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysMonthNotBetween(Long value1, Long value2) {
            addCriterion("sys_month not between", value1, value2, "sysMonth");
            return (Criteria) this;
        }

        public Criteria andSysJikaIsNull() {
            addCriterion("sys_jika is null");
            return (Criteria) this;
        }

        public Criteria andSysJikaIsNotNull() {
            addCriterion("sys_jika is not null");
            return (Criteria) this;
        }

        public Criteria andSysJikaEqualTo(Long value) {
            addCriterion("sys_jika =", value, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaNotEqualTo(Long value) {
            addCriterion("sys_jika <>", value, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaGreaterThan(Long value) {
            addCriterion("sys_jika >", value, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_jika >=", value, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaLessThan(Long value) {
            addCriterion("sys_jika <", value, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaLessThanOrEqualTo(Long value) {
            addCriterion("sys_jika <=", value, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaIn(List<Long> values) {
            addCriterion("sys_jika in", values, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaNotIn(List<Long> values) {
            addCriterion("sys_jika not in", values, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaBetween(Long value1, Long value2) {
            addCriterion("sys_jika between", value1, value2, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysJikaNotBetween(Long value1, Long value2) {
            addCriterion("sys_jika not between", value1, value2, "sysJika");
            return (Criteria) this;
        }

        public Criteria andSysYearIsNull() {
            addCriterion("sys_year is null");
            return (Criteria) this;
        }

        public Criteria andSysYearIsNotNull() {
            addCriterion("sys_year is not null");
            return (Criteria) this;
        }

        public Criteria andSysYearEqualTo(Long value) {
            addCriterion("sys_year =", value, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearNotEqualTo(Long value) {
            addCriterion("sys_year <>", value, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearGreaterThan(Long value) {
            addCriterion("sys_year >", value, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_year >=", value, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearLessThan(Long value) {
            addCriterion("sys_year <", value, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearLessThanOrEqualTo(Long value) {
            addCriterion("sys_year <=", value, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearIn(List<Long> values) {
            addCriterion("sys_year in", values, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearNotIn(List<Long> values) {
            addCriterion("sys_year not in", values, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearBetween(Long value1, Long value2) {
            addCriterion("sys_year between", value1, value2, "sysYear");
            return (Criteria) this;
        }

        public Criteria andSysYearNotBetween(Long value1, Long value2) {
            addCriterion("sys_year not between", value1, value2, "sysYear");
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