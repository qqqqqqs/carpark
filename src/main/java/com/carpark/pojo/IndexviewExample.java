package com.carpark.pojo;

import java.util.ArrayList;
import java.util.List;

public class IndexviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexviewExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNull() {
            addCriterion("car_name is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("car_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("car_name =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("car_name <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("car_name >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_name >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("car_name <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("car_name <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("car_name like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("car_name not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("car_name in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("car_name not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("car_name between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("car_name not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeIsNull() {
            addCriterion("car_StartTime is null");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeIsNotNull() {
            addCriterion("car_StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeEqualTo(String value) {
            addCriterion("car_StartTime =", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeNotEqualTo(String value) {
            addCriterion("car_StartTime <>", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeGreaterThan(String value) {
            addCriterion("car_StartTime >", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_StartTime >=", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeLessThan(String value) {
            addCriterion("car_StartTime <", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeLessThanOrEqualTo(String value) {
            addCriterion("car_StartTime <=", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeLike(String value) {
            addCriterion("car_StartTime like", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeNotLike(String value) {
            addCriterion("car_StartTime not like", value, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeIn(List<String> values) {
            addCriterion("car_StartTime in", values, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeNotIn(List<String> values) {
            addCriterion("car_StartTime not in", values, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeBetween(String value1, String value2) {
            addCriterion("car_StartTime between", value1, value2, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarStarttimeNotBetween(String value1, String value2) {
            addCriterion("car_StartTime not between", value1, value2, "carStarttime");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_Type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_Type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_Type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_Type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_Type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_Type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_Type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_Type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_Type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_Type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_Type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_Type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_Type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_Type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNull() {
            addCriterion("car_state is null");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNotNull() {
            addCriterion("car_state is not null");
            return (Criteria) this;
        }

        public Criteria andCarStateEqualTo(String value) {
            addCriterion("car_state =", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotEqualTo(String value) {
            addCriterion("car_state <>", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThan(String value) {
            addCriterion("car_state >", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThanOrEqualTo(String value) {
            addCriterion("car_state >=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThan(String value) {
            addCriterion("car_state <", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThanOrEqualTo(String value) {
            addCriterion("car_state <=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLike(String value) {
            addCriterion("car_state like", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotLike(String value) {
            addCriterion("car_state not like", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateIn(List<String> values) {
            addCriterion("car_state in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotIn(List<String> values) {
            addCriterion("car_state not in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateBetween(String value1, String value2) {
            addCriterion("car_state between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotBetween(String value1, String value2) {
            addCriterion("car_state not between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarMoneyIsNull() {
            addCriterion("car_money is null");
            return (Criteria) this;
        }

        public Criteria andCarMoneyIsNotNull() {
            addCriterion("car_money is not null");
            return (Criteria) this;
        }

        public Criteria andCarMoneyEqualTo(Long value) {
            addCriterion("car_money =", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyNotEqualTo(Long value) {
            addCriterion("car_money <>", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyGreaterThan(Long value) {
            addCriterion("car_money >", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("car_money >=", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyLessThan(Long value) {
            addCriterion("car_money <", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyLessThanOrEqualTo(Long value) {
            addCriterion("car_money <=", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyIn(List<Long> values) {
            addCriterion("car_money in", values, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyNotIn(List<Long> values) {
            addCriterion("car_money not in", values, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyBetween(Long value1, Long value2) {
            addCriterion("car_money between", value1, value2, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyNotBetween(Long value1, Long value2) {
            addCriterion("car_money not between", value1, value2, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeIsNull() {
            addCriterion("car_endTime is null");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeIsNotNull() {
            addCriterion("car_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeEqualTo(String value) {
            addCriterion("car_endTime =", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeNotEqualTo(String value) {
            addCriterion("car_endTime <>", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeGreaterThan(String value) {
            addCriterion("car_endTime >", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_endTime >=", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeLessThan(String value) {
            addCriterion("car_endTime <", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeLessThanOrEqualTo(String value) {
            addCriterion("car_endTime <=", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeLike(String value) {
            addCriterion("car_endTime like", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeNotLike(String value) {
            addCriterion("car_endTime not like", value, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeIn(List<String> values) {
            addCriterion("car_endTime in", values, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeNotIn(List<String> values) {
            addCriterion("car_endTime not in", values, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeBetween(String value1, String value2) {
            addCriterion("car_endTime between", value1, value2, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andCarEndtimeNotBetween(String value1, String value2) {
            addCriterion("car_endTime not between", value1, value2, "carEndtime");
            return (Criteria) this;
        }

        public Criteria andPuserIdIsNull() {
            addCriterion("puser_id is null");
            return (Criteria) this;
        }

        public Criteria andPuserIdIsNotNull() {
            addCriterion("puser_id is not null");
            return (Criteria) this;
        }

        public Criteria andPuserIdEqualTo(Integer value) {
            addCriterion("puser_id =", value, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdNotEqualTo(Integer value) {
            addCriterion("puser_id <>", value, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdGreaterThan(Integer value) {
            addCriterion("puser_id >", value, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("puser_id >=", value, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdLessThan(Integer value) {
            addCriterion("puser_id <", value, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("puser_id <=", value, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdIn(List<Integer> values) {
            addCriterion("puser_id in", values, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdNotIn(List<Integer> values) {
            addCriterion("puser_id not in", values, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdBetween(Integer value1, Integer value2) {
            addCriterion("puser_id between", value1, value2, "puserId");
            return (Criteria) this;
        }

        public Criteria andPuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("puser_id not between", value1, value2, "puserId");
            return (Criteria) this;
        }

        public Criteria andPortIdIsNull() {
            addCriterion("port_id is null");
            return (Criteria) this;
        }

        public Criteria andPortIdIsNotNull() {
            addCriterion("port_id is not null");
            return (Criteria) this;
        }

        public Criteria andPortIdEqualTo(Integer value) {
            addCriterion("port_id =", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotEqualTo(Integer value) {
            addCriterion("port_id <>", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThan(Integer value) {
            addCriterion("port_id >", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("port_id >=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThan(Integer value) {
            addCriterion("port_id <", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThanOrEqualTo(Integer value) {
            addCriterion("port_id <=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdIn(List<Integer> values) {
            addCriterion("port_id in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotIn(List<Integer> values) {
            addCriterion("port_id not in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdBetween(Integer value1, Integer value2) {
            addCriterion("port_id between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("port_id not between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andPortNameIsNull() {
            addCriterion("port_name is null");
            return (Criteria) this;
        }

        public Criteria andPortNameIsNotNull() {
            addCriterion("port_name is not null");
            return (Criteria) this;
        }

        public Criteria andPortNameEqualTo(String value) {
            addCriterion("port_name =", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotEqualTo(String value) {
            addCriterion("port_name <>", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameGreaterThan(String value) {
            addCriterion("port_name >", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameGreaterThanOrEqualTo(String value) {
            addCriterion("port_name >=", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLessThan(String value) {
            addCriterion("port_name <", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLessThanOrEqualTo(String value) {
            addCriterion("port_name <=", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLike(String value) {
            addCriterion("port_name like", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotLike(String value) {
            addCriterion("port_name not like", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameIn(List<String> values) {
            addCriterion("port_name in", values, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotIn(List<String> values) {
            addCriterion("port_name not in", values, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameBetween(String value1, String value2) {
            addCriterion("port_name between", value1, value2, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotBetween(String value1, String value2) {
            addCriterion("port_name not between", value1, value2, "portName");
            return (Criteria) this;
        }

        public Criteria andPortStateIsNull() {
            addCriterion("port_state is null");
            return (Criteria) this;
        }

        public Criteria andPortStateIsNotNull() {
            addCriterion("port_state is not null");
            return (Criteria) this;
        }

        public Criteria andPortStateEqualTo(String value) {
            addCriterion("port_state =", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateNotEqualTo(String value) {
            addCriterion("port_state <>", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateGreaterThan(String value) {
            addCriterion("port_state >", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateGreaterThanOrEqualTo(String value) {
            addCriterion("port_state >=", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateLessThan(String value) {
            addCriterion("port_state <", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateLessThanOrEqualTo(String value) {
            addCriterion("port_state <=", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateLike(String value) {
            addCriterion("port_state like", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateNotLike(String value) {
            addCriterion("port_state not like", value, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateIn(List<String> values) {
            addCriterion("port_state in", values, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateNotIn(List<String> values) {
            addCriterion("port_state not in", values, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateBetween(String value1, String value2) {
            addCriterion("port_state between", value1, value2, "portState");
            return (Criteria) this;
        }

        public Criteria andPortStateNotBetween(String value1, String value2) {
            addCriterion("port_state not between", value1, value2, "portState");
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