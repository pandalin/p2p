package com.jvv.p2p.entity;

import java.util.ArrayList;
import java.util.List;

public class ExtUserDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtUserDtoExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(String value) {
            addCriterion("activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(String value) {
            addCriterion("activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(String value) {
            addCriterion("activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(String value) {
            addCriterion("activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(String value) {
            addCriterion("activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(String value) {
            addCriterion("activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLike(String value) {
            addCriterion("activity like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotLike(String value) {
            addCriterion("activity not like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<String> values) {
            addCriterion("activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<String> values) {
            addCriterion("activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(String value1, String value2) {
            addCriterion("activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(String value1, String value2) {
            addCriterion("activity not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andRealnameopenIsNull() {
            addCriterion("realnameopen is null");
            return (Criteria) this;
        }

        public Criteria andRealnameopenIsNotNull() {
            addCriterion("realnameopen is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameopenEqualTo(String value) {
            addCriterion("realnameopen =", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenNotEqualTo(String value) {
            addCriterion("realnameopen <>", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenGreaterThan(String value) {
            addCriterion("realnameopen >", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenGreaterThanOrEqualTo(String value) {
            addCriterion("realnameopen >=", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenLessThan(String value) {
            addCriterion("realnameopen <", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenLessThanOrEqualTo(String value) {
            addCriterion("realnameopen <=", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenLike(String value) {
            addCriterion("realnameopen like", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenNotLike(String value) {
            addCriterion("realnameopen not like", value, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenIn(List<String> values) {
            addCriterion("realnameopen in", values, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenNotIn(List<String> values) {
            addCriterion("realnameopen not in", values, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenBetween(String value1, String value2) {
            addCriterion("realnameopen between", value1, value2, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andRealnameopenNotBetween(String value1, String value2) {
            addCriterion("realnameopen not between", value1, value2, "realnameopen");
            return (Criteria) this;
        }

        public Criteria andPayopenIsNull() {
            addCriterion("payopen is null");
            return (Criteria) this;
        }

        public Criteria andPayopenIsNotNull() {
            addCriterion("payopen is not null");
            return (Criteria) this;
        }

        public Criteria andPayopenEqualTo(String value) {
            addCriterion("payopen =", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenNotEqualTo(String value) {
            addCriterion("payopen <>", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenGreaterThan(String value) {
            addCriterion("payopen >", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenGreaterThanOrEqualTo(String value) {
            addCriterion("payopen >=", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenLessThan(String value) {
            addCriterion("payopen <", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenLessThanOrEqualTo(String value) {
            addCriterion("payopen <=", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenLike(String value) {
            addCriterion("payopen like", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenNotLike(String value) {
            addCriterion("payopen not like", value, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenIn(List<String> values) {
            addCriterion("payopen in", values, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenNotIn(List<String> values) {
            addCriterion("payopen not in", values, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenBetween(String value1, String value2) {
            addCriterion("payopen between", value1, value2, "payopen");
            return (Criteria) this;
        }

        public Criteria andPayopenNotBetween(String value1, String value2) {
            addCriterion("payopen not between", value1, value2, "payopen");
            return (Criteria) this;
        }

        public Criteria andBindopenIsNull() {
            addCriterion("bindopen is null");
            return (Criteria) this;
        }

        public Criteria andBindopenIsNotNull() {
            addCriterion("bindopen is not null");
            return (Criteria) this;
        }

        public Criteria andBindopenEqualTo(String value) {
            addCriterion("bindopen =", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenNotEqualTo(String value) {
            addCriterion("bindopen <>", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenGreaterThan(String value) {
            addCriterion("bindopen >", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenGreaterThanOrEqualTo(String value) {
            addCriterion("bindopen >=", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenLessThan(String value) {
            addCriterion("bindopen <", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenLessThanOrEqualTo(String value) {
            addCriterion("bindopen <=", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenLike(String value) {
            addCriterion("bindopen like", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenNotLike(String value) {
            addCriterion("bindopen not like", value, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenIn(List<String> values) {
            addCriterion("bindopen in", values, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenNotIn(List<String> values) {
            addCriterion("bindopen not in", values, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenBetween(String value1, String value2) {
            addCriterion("bindopen between", value1, value2, "bindopen");
            return (Criteria) this;
        }

        public Criteria andBindopenNotBetween(String value1, String value2) {
            addCriterion("bindopen not between", value1, value2, "bindopen");
            return (Criteria) this;
        }

        public Criteria andExtUserIdIsNull() {
            addCriterion("ext_user_id is null");
            return (Criteria) this;
        }

        public Criteria andExtUserIdIsNotNull() {
            addCriterion("ext_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtUserIdEqualTo(String value) {
            addCriterion("ext_user_id =", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdNotEqualTo(String value) {
            addCriterion("ext_user_id <>", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdGreaterThan(String value) {
            addCriterion("ext_user_id >", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ext_user_id >=", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdLessThan(String value) {
            addCriterion("ext_user_id <", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdLessThanOrEqualTo(String value) {
            addCriterion("ext_user_id <=", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdLike(String value) {
            addCriterion("ext_user_id like", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdNotLike(String value) {
            addCriterion("ext_user_id not like", value, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdIn(List<String> values) {
            addCriterion("ext_user_id in", values, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdNotIn(List<String> values) {
            addCriterion("ext_user_id not in", values, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdBetween(String value1, String value2) {
            addCriterion("ext_user_id between", value1, value2, "extUserId");
            return (Criteria) this;
        }

        public Criteria andExtUserIdNotBetween(String value1, String value2) {
            addCriterion("ext_user_id not between", value1, value2, "extUserId");
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