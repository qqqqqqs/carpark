package com.carpark.pojo;

import java.util.ArrayList;
import java.util.List;

public class UseTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UseTableExample() {
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

        public Criteria andUseIdIsNull() {
            addCriterion("use_id is null");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNotNull() {
            addCriterion("use_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseIdEqualTo(Integer value) {
            addCriterion("use_id =", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotEqualTo(Integer value) {
            addCriterion("use_id <>", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThan(Integer value) {
            addCriterion("use_id >", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_id >=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThan(Integer value) {
            addCriterion("use_id <", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_id <=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdIn(List<Integer> values) {
            addCriterion("use_id in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotIn(List<Integer> values) {
            addCriterion("use_id not in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdBetween(Integer value1, Integer value2) {
            addCriterion("use_id between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_id not between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUseMailIsNull() {
            addCriterion("use_mail is null");
            return (Criteria) this;
        }

        public Criteria andUseMailIsNotNull() {
            addCriterion("use_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUseMailEqualTo(String value) {
            addCriterion("use_mail =", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailNotEqualTo(String value) {
            addCriterion("use_mail <>", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailGreaterThan(String value) {
            addCriterion("use_mail >", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailGreaterThanOrEqualTo(String value) {
            addCriterion("use_mail >=", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailLessThan(String value) {
            addCriterion("use_mail <", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailLessThanOrEqualTo(String value) {
            addCriterion("use_mail <=", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailLike(String value) {
            addCriterion("use_mail like", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailNotLike(String value) {
            addCriterion("use_mail not like", value, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailIn(List<String> values) {
            addCriterion("use_mail in", values, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailNotIn(List<String> values) {
            addCriterion("use_mail not in", values, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailBetween(String value1, String value2) {
            addCriterion("use_mail between", value1, value2, "useMail");
            return (Criteria) this;
        }

        public Criteria andUseMailNotBetween(String value1, String value2) {
            addCriterion("use_mail not between", value1, value2, "useMail");
            return (Criteria) this;
        }

        public Criteria andUsePhoneIsNull() {
            addCriterion("use_phone is null");
            return (Criteria) this;
        }

        public Criteria andUsePhoneIsNotNull() {
            addCriterion("use_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUsePhoneEqualTo(String value) {
            addCriterion("use_phone =", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneNotEqualTo(String value) {
            addCriterion("use_phone <>", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneGreaterThan(String value) {
            addCriterion("use_phone >", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("use_phone >=", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneLessThan(String value) {
            addCriterion("use_phone <", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneLessThanOrEqualTo(String value) {
            addCriterion("use_phone <=", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneLike(String value) {
            addCriterion("use_phone like", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneNotLike(String value) {
            addCriterion("use_phone not like", value, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneIn(List<String> values) {
            addCriterion("use_phone in", values, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneNotIn(List<String> values) {
            addCriterion("use_phone not in", values, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneBetween(String value1, String value2) {
            addCriterion("use_phone between", value1, value2, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePhoneNotBetween(String value1, String value2) {
            addCriterion("use_phone not between", value1, value2, "usePhone");
            return (Criteria) this;
        }

        public Criteria andUsePwdIsNull() {
            addCriterion("use_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUsePwdIsNotNull() {
            addCriterion("use_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUsePwdEqualTo(String value) {
            addCriterion("use_pwd =", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdNotEqualTo(String value) {
            addCriterion("use_pwd <>", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdGreaterThan(String value) {
            addCriterion("use_pwd >", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdGreaterThanOrEqualTo(String value) {
            addCriterion("use_pwd >=", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdLessThan(String value) {
            addCriterion("use_pwd <", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdLessThanOrEqualTo(String value) {
            addCriterion("use_pwd <=", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdLike(String value) {
            addCriterion("use_pwd like", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdNotLike(String value) {
            addCriterion("use_pwd not like", value, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdIn(List<String> values) {
            addCriterion("use_pwd in", values, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdNotIn(List<String> values) {
            addCriterion("use_pwd not in", values, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdBetween(String value1, String value2) {
            addCriterion("use_pwd between", value1, value2, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsePwdNotBetween(String value1, String value2) {
            addCriterion("use_pwd not between", value1, value2, "usePwd");
            return (Criteria) this;
        }

        public Criteria andUsecarNameIsNull() {
            addCriterion("usecar_name is null");
            return (Criteria) this;
        }

        public Criteria andUsecarNameIsNotNull() {
            addCriterion("usecar_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsecarNameEqualTo(String value) {
            addCriterion("usecar_name =", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameNotEqualTo(String value) {
            addCriterion("usecar_name <>", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameGreaterThan(String value) {
            addCriterion("usecar_name >", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameGreaterThanOrEqualTo(String value) {
            addCriterion("usecar_name >=", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameLessThan(String value) {
            addCriterion("usecar_name <", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameLessThanOrEqualTo(String value) {
            addCriterion("usecar_name <=", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameLike(String value) {
            addCriterion("usecar_name like", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameNotLike(String value) {
            addCriterion("usecar_name not like", value, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameIn(List<String> values) {
            addCriterion("usecar_name in", values, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameNotIn(List<String> values) {
            addCriterion("usecar_name not in", values, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameBetween(String value1, String value2) {
            addCriterion("usecar_name between", value1, value2, "usecarName");
            return (Criteria) this;
        }

        public Criteria andUsecarNameNotBetween(String value1, String value2) {
            addCriterion("usecar_name not between", value1, value2, "usecarName");
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