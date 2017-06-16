package com.jvv.p2p.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeFlowDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeFlowDtoExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andRedpacketidIsNull() {
            addCriterion("redpacketid is null");
            return (Criteria) this;
        }

        public Criteria andRedpacketidIsNotNull() {
            addCriterion("redpacketid is not null");
            return (Criteria) this;
        }

        public Criteria andRedpacketidEqualTo(String value) {
            addCriterion("redpacketid =", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidNotEqualTo(String value) {
            addCriterion("redpacketid <>", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidGreaterThan(String value) {
            addCriterion("redpacketid >", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidGreaterThanOrEqualTo(String value) {
            addCriterion("redpacketid >=", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidLessThan(String value) {
            addCriterion("redpacketid <", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidLessThanOrEqualTo(String value) {
            addCriterion("redpacketid <=", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidLike(String value) {
            addCriterion("redpacketid like", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidNotLike(String value) {
            addCriterion("redpacketid not like", value, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidIn(List<String> values) {
            addCriterion("redpacketid in", values, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidNotIn(List<String> values) {
            addCriterion("redpacketid not in", values, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidBetween(String value1, String value2) {
            addCriterion("redpacketid between", value1, value2, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andRedpacketidNotBetween(String value1, String value2) {
            addCriterion("redpacketid not between", value1, value2, "redpacketid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdIsNull() {
            addCriterion("ext_trade_id is null");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdIsNotNull() {
            addCriterion("ext_trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdEqualTo(String value) {
            addCriterion("ext_trade_id =", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdNotEqualTo(String value) {
            addCriterion("ext_trade_id <>", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdGreaterThan(String value) {
            addCriterion("ext_trade_id >", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ext_trade_id >=", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdLessThan(String value) {
            addCriterion("ext_trade_id <", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdLessThanOrEqualTo(String value) {
            addCriterion("ext_trade_id <=", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdLike(String value) {
            addCriterion("ext_trade_id like", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdNotLike(String value) {
            addCriterion("ext_trade_id not like", value, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdIn(List<String> values) {
            addCriterion("ext_trade_id in", values, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdNotIn(List<String> values) {
            addCriterion("ext_trade_id not in", values, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdBetween(String value1, String value2) {
            addCriterion("ext_trade_id between", value1, value2, "extTradeId");
            return (Criteria) this;
        }

        public Criteria andExtTradeIdNotBetween(String value1, String value2) {
            addCriterion("ext_trade_id not between", value1, value2, "extTradeId");
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