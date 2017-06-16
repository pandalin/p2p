package com.jvv.p2p.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeDtoExample() {
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

        public Criteria andChanelIdIsNull() {
            addCriterion("chanel_id is null");
            return (Criteria) this;
        }

        public Criteria andChanelIdIsNotNull() {
            addCriterion("chanel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChanelIdEqualTo(String value) {
            addCriterion("chanel_id =", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdNotEqualTo(String value) {
            addCriterion("chanel_id <>", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdGreaterThan(String value) {
            addCriterion("chanel_id >", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdGreaterThanOrEqualTo(String value) {
            addCriterion("chanel_id >=", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdLessThan(String value) {
            addCriterion("chanel_id <", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdLessThanOrEqualTo(String value) {
            addCriterion("chanel_id <=", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdLike(String value) {
            addCriterion("chanel_id like", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdNotLike(String value) {
            addCriterion("chanel_id not like", value, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdIn(List<String> values) {
            addCriterion("chanel_id in", values, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdNotIn(List<String> values) {
            addCriterion("chanel_id not in", values, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdBetween(String value1, String value2) {
            addCriterion("chanel_id between", value1, value2, "chanelId");
            return (Criteria) this;
        }

        public Criteria andChanelIdNotBetween(String value1, String value2) {
            addCriterion("chanel_id not between", value1, value2, "chanelId");
            return (Criteria) this;
        }

        public Criteria andExtIdIsNull() {
            addCriterion("ext_id is null");
            return (Criteria) this;
        }

        public Criteria andExtIdIsNotNull() {
            addCriterion("ext_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtIdEqualTo(Integer value) {
            addCriterion("ext_id =", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdNotEqualTo(Integer value) {
            addCriterion("ext_id <>", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdGreaterThan(Integer value) {
            addCriterion("ext_id >", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_id >=", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdLessThan(Integer value) {
            addCriterion("ext_id <", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ext_id <=", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdIn(List<Integer> values) {
            addCriterion("ext_id in", values, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdNotIn(List<Integer> values) {
            addCriterion("ext_id not in", values, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdBetween(Integer value1, Integer value2) {
            addCriterion("ext_id between", value1, value2, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_id not between", value1, value2, "extId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDemandIdIsNull() {
            addCriterion("demand_id is null");
            return (Criteria) this;
        }

        public Criteria andDemandIdIsNotNull() {
            addCriterion("demand_id is not null");
            return (Criteria) this;
        }

        public Criteria andDemandIdEqualTo(Integer value) {
            addCriterion("demand_id =", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotEqualTo(Integer value) {
            addCriterion("demand_id <>", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdGreaterThan(Integer value) {
            addCriterion("demand_id >", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_id >=", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdLessThan(Integer value) {
            addCriterion("demand_id <", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdLessThanOrEqualTo(Integer value) {
            addCriterion("demand_id <=", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdIn(List<Integer> values) {
            addCriterion("demand_id in", values, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotIn(List<Integer> values) {
            addCriterion("demand_id not in", values, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdBetween(Integer value1, Integer value2) {
            addCriterion("demand_id between", value1, value2, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_id not between", value1, value2, "demandId");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNull() {
            addCriterion("trade_name is null");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNotNull() {
            addCriterion("trade_name is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNameEqualTo(String value) {
            addCriterion("trade_name =", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotEqualTo(String value) {
            addCriterion("trade_name <>", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThan(String value) {
            addCriterion("trade_name >", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_name >=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThan(String value) {
            addCriterion("trade_name <", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThanOrEqualTo(String value) {
            addCriterion("trade_name <=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLike(String value) {
            addCriterion("trade_name like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotLike(String value) {
            addCriterion("trade_name not like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameIn(List<String> values) {
            addCriterion("trade_name in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotIn(List<String> values) {
            addCriterion("trade_name not in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameBetween(String value1, String value2) {
            addCriterion("trade_name between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotBetween(String value1, String value2) {
            addCriterion("trade_name not between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(Long value) {
            addCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(Long value) {
            addCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(Long value) {
            addCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(Long value) {
            addCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(Long value) {
            addCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<Long> values) {
            addCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<Long> values) {
            addCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(Long value1, Long value2) {
            addCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(Long value1, Long value2) {
            addCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andPerlenIsNull() {
            addCriterion("perlen is null");
            return (Criteria) this;
        }

        public Criteria andPerlenIsNotNull() {
            addCriterion("perlen is not null");
            return (Criteria) this;
        }

        public Criteria andPerlenEqualTo(BigDecimal value) {
            addCriterion("perlen =", value, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenNotEqualTo(BigDecimal value) {
            addCriterion("perlen <>", value, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenGreaterThan(BigDecimal value) {
            addCriterion("perlen >", value, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("perlen >=", value, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenLessThan(BigDecimal value) {
            addCriterion("perlen <", value, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("perlen <=", value, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenIn(List<BigDecimal> values) {
            addCriterion("perlen in", values, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenNotIn(List<BigDecimal> values) {
            addCriterion("perlen not in", values, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("perlen between", value1, value2, "perlen");
            return (Criteria) this;
        }

        public Criteria andPerlenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("perlen not between", value1, value2, "perlen");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNull() {
            addCriterion("interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNotNull() {
            addCriterion("interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateEqualTo(Short value) {
            addCriterion("interest_rate =", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotEqualTo(Short value) {
            addCriterion("interest_rate <>", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThan(Short value) {
            addCriterion("interest_rate >", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThanOrEqualTo(Short value) {
            addCriterion("interest_rate >=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThan(Short value) {
            addCriterion("interest_rate <", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThanOrEqualTo(Short value) {
            addCriterion("interest_rate <=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIn(List<Short> values) {
            addCriterion("interest_rate in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotIn(List<Short> values) {
            addCriterion("interest_rate not in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateBetween(Short value1, Short value2) {
            addCriterion("interest_rate between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotBetween(Short value1, Short value2) {
            addCriterion("interest_rate not between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountIsNull() {
            addCriterion("least_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountIsNotNull() {
            addCriterion("least_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountEqualTo(Long value) {
            addCriterion("least_invest_amount =", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountNotEqualTo(Long value) {
            addCriterion("least_invest_amount <>", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountGreaterThan(Long value) {
            addCriterion("least_invest_amount >", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("least_invest_amount >=", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountLessThan(Long value) {
            addCriterion("least_invest_amount <", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountLessThanOrEqualTo(Long value) {
            addCriterion("least_invest_amount <=", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountIn(List<Long> values) {
            addCriterion("least_invest_amount in", values, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountNotIn(List<Long> values) {
            addCriterion("least_invest_amount not in", values, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountBetween(Long value1, Long value2) {
            addCriterion("least_invest_amount between", value1, value2, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountNotBetween(Long value1, Long value2) {
            addCriterion("least_invest_amount not between", value1, value2, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountIsNull() {
            addCriterion("invested_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountIsNotNull() {
            addCriterion("invested_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountEqualTo(Long value) {
            addCriterion("invested_amount =", value, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountNotEqualTo(Long value) {
            addCriterion("invested_amount <>", value, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountGreaterThan(Long value) {
            addCriterion("invested_amount >", value, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("invested_amount >=", value, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountLessThan(Long value) {
            addCriterion("invested_amount <", value, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountLessThanOrEqualTo(Long value) {
            addCriterion("invested_amount <=", value, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountIn(List<Long> values) {
            addCriterion("invested_amount in", values, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountNotIn(List<Long> values) {
            addCriterion("invested_amount not in", values, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountBetween(Long value1, Long value2) {
            addCriterion("invested_amount between", value1, value2, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andInvestedAmountNotBetween(Long value1, Long value2) {
            addCriterion("invested_amount not between", value1, value2, "investedAmount");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodIsNull() {
            addCriterion("saturation_condition_method is null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodIsNotNull() {
            addCriterion("saturation_condition_method is not null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodEqualTo(String value) {
            addCriterion("saturation_condition_method =", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotEqualTo(String value) {
            addCriterion("saturation_condition_method <>", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodGreaterThan(String value) {
            addCriterion("saturation_condition_method >", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodGreaterThanOrEqualTo(String value) {
            addCriterion("saturation_condition_method >=", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodLessThan(String value) {
            addCriterion("saturation_condition_method <", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodLessThanOrEqualTo(String value) {
            addCriterion("saturation_condition_method <=", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodLike(String value) {
            addCriterion("saturation_condition_method like", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotLike(String value) {
            addCriterion("saturation_condition_method not like", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodIn(List<String> values) {
            addCriterion("saturation_condition_method in", values, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotIn(List<String> values) {
            addCriterion("saturation_condition_method not in", values, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodBetween(String value1, String value2) {
            addCriterion("saturation_condition_method between", value1, value2, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotBetween(String value1, String value2) {
            addCriterion("saturation_condition_method not between", value1, value2, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionIsNull() {
            addCriterion("saturation_condition is null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionIsNotNull() {
            addCriterion("saturation_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionEqualTo(Long value) {
            addCriterion("saturation_condition =", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionNotEqualTo(Long value) {
            addCriterion("saturation_condition <>", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionGreaterThan(Long value) {
            addCriterion("saturation_condition >", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionGreaterThanOrEqualTo(Long value) {
            addCriterion("saturation_condition >=", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionLessThan(Long value) {
            addCriterion("saturation_condition <", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionLessThanOrEqualTo(Long value) {
            addCriterion("saturation_condition <=", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionIn(List<Long> values) {
            addCriterion("saturation_condition in", values, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionNotIn(List<Long> values) {
            addCriterion("saturation_condition not in", values, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionBetween(Long value1, Long value2) {
            addCriterion("saturation_condition between", value1, value2, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionNotBetween(Long value1, Long value2) {
            addCriterion("saturation_condition not between", value1, value2, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIsNull() {
            addCriterion("time_limit_unit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIsNotNull() {
            addCriterion("time_limit_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitEqualTo(String value) {
            addCriterion("time_limit_unit =", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotEqualTo(String value) {
            addCriterion("time_limit_unit <>", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitGreaterThan(String value) {
            addCriterion("time_limit_unit >", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit_unit >=", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLessThan(String value) {
            addCriterion("time_limit_unit <", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLessThanOrEqualTo(String value) {
            addCriterion("time_limit_unit <=", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLike(String value) {
            addCriterion("time_limit_unit like", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotLike(String value) {
            addCriterion("time_limit_unit not like", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIn(List<String> values) {
            addCriterion("time_limit_unit in", values, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotIn(List<String> values) {
            addCriterion("time_limit_unit not in", values, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitBetween(String value1, String value2) {
            addCriterion("time_limit_unit between", value1, value2, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotBetween(String value1, String value2) {
            addCriterion("time_limit_unit not between", value1, value2, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIsNull() {
            addCriterion("invest_start_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIsNotNull() {
            addCriterion("invest_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateEqualTo(Date value) {
            addCriterion("invest_start_date =", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotEqualTo(Date value) {
            addCriterion("invest_start_date <>", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateGreaterThan(Date value) {
            addCriterion("invest_start_date >", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invest_start_date >=", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateLessThan(Date value) {
            addCriterion("invest_start_date <", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateLessThanOrEqualTo(Date value) {
            addCriterion("invest_start_date <=", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIn(List<Date> values) {
            addCriterion("invest_start_date in", values, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotIn(List<Date> values) {
            addCriterion("invest_start_date not in", values, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateBetween(Date value1, Date value2) {
            addCriterion("invest_start_date between", value1, value2, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotBetween(Date value1, Date value2) {
            addCriterion("invest_start_date not between", value1, value2, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateIsNull() {
            addCriterion("invest_end_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateIsNotNull() {
            addCriterion("invest_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateEqualTo(Date value) {
            addCriterion("invest_end_date =", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateNotEqualTo(Date value) {
            addCriterion("invest_end_date <>", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateGreaterThan(Date value) {
            addCriterion("invest_end_date >", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invest_end_date >=", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateLessThan(Date value) {
            addCriterion("invest_end_date <", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateLessThanOrEqualTo(Date value) {
            addCriterion("invest_end_date <=", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateIn(List<Date> values) {
            addCriterion("invest_end_date in", values, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateNotIn(List<Date> values) {
            addCriterion("invest_end_date not in", values, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateBetween(Date value1, Date value2) {
            addCriterion("invest_end_date between", value1, value2, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateNotBetween(Date value1, Date value2) {
            addCriterion("invest_end_date not between", value1, value2, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateIsNull() {
            addCriterion("trade_expire_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateIsNotNull() {
            addCriterion("trade_expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateEqualTo(Date value) {
            addCriterion("trade_expire_date =", value, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateNotEqualTo(Date value) {
            addCriterion("trade_expire_date <>", value, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateGreaterThan(Date value) {
            addCriterion("trade_expire_date >", value, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_expire_date >=", value, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateLessThan(Date value) {
            addCriterion("trade_expire_date <", value, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("trade_expire_date <=", value, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateIn(List<Date> values) {
            addCriterion("trade_expire_date in", values, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateNotIn(List<Date> values) {
            addCriterion("trade_expire_date not in", values, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateBetween(Date value1, Date value2) {
            addCriterion("trade_expire_date between", value1, value2, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("trade_expire_date not between", value1, value2, "tradeExpireDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateIsNull() {
            addCriterion("trade_effective_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateIsNotNull() {
            addCriterion("trade_effective_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateEqualTo(Date value) {
            addCriterion("trade_effective_date =", value, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateNotEqualTo(Date value) {
            addCriterion("trade_effective_date <>", value, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateGreaterThan(Date value) {
            addCriterion("trade_effective_date >", value, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_effective_date >=", value, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateLessThan(Date value) {
            addCriterion("trade_effective_date <", value, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterion("trade_effective_date <=", value, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateIn(List<Date> values) {
            addCriterion("trade_effective_date in", values, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateNotIn(List<Date> values) {
            addCriterion("trade_effective_date not in", values, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateBetween(Date value1, Date value2) {
            addCriterion("trade_effective_date between", value1, value2, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterion("trade_effective_date not between", value1, value2, "tradeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateIsNull() {
            addCriterion("trade_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateIsNotNull() {
            addCriterion("trade_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateEqualTo(Date value) {
            addCriterion("trade_finish_date =", value, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateNotEqualTo(Date value) {
            addCriterion("trade_finish_date <>", value, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateGreaterThan(Date value) {
            addCriterion("trade_finish_date >", value, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_finish_date >=", value, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateLessThan(Date value) {
            addCriterion("trade_finish_date <", value, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("trade_finish_date <=", value, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateIn(List<Date> values) {
            addCriterion("trade_finish_date in", values, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateNotIn(List<Date> values) {
            addCriterion("trade_finish_date not in", values, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateBetween(Date value1, Date value2) {
            addCriterion("trade_finish_date between", value1, value2, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andTradeFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("trade_finish_date not between", value1, value2, "tradeFinishDate");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeIsNull() {
            addCriterion("ext_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeIsNotNull() {
            addCriterion("ext_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeEqualTo(Date value) {
            addCriterion("ext_create_time =", value, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeNotEqualTo(Date value) {
            addCriterion("ext_create_time <>", value, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeGreaterThan(Date value) {
            addCriterion("ext_create_time >", value, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ext_create_time >=", value, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeLessThan(Date value) {
            addCriterion("ext_create_time <", value, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ext_create_time <=", value, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeIn(List<Date> values) {
            addCriterion("ext_create_time in", values, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeNotIn(List<Date> values) {
            addCriterion("ext_create_time not in", values, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ext_create_time between", value1, value2, "extCreateTime");
            return (Criteria) this;
        }

        public Criteria andExtCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ext_create_time not between", value1, value2, "extCreateTime");
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

        public Criteria andIscreatecontractIsNull() {
            addCriterion("iscreatecontract is null");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractIsNotNull() {
            addCriterion("iscreatecontract is not null");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractEqualTo(Long value) {
            addCriterion("iscreatecontract =", value, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractNotEqualTo(Long value) {
            addCriterion("iscreatecontract <>", value, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractGreaterThan(Long value) {
            addCriterion("iscreatecontract >", value, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractGreaterThanOrEqualTo(Long value) {
            addCriterion("iscreatecontract >=", value, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractLessThan(Long value) {
            addCriterion("iscreatecontract <", value, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractLessThanOrEqualTo(Long value) {
            addCriterion("iscreatecontract <=", value, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractIn(List<Long> values) {
            addCriterion("iscreatecontract in", values, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractNotIn(List<Long> values) {
            addCriterion("iscreatecontract not in", values, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractBetween(Long value1, Long value2) {
            addCriterion("iscreatecontract between", value1, value2, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIscreatecontractNotBetween(Long value1, Long value2) {
            addCriterion("iscreatecontract not between", value1, value2, "iscreatecontract");
            return (Criteria) this;
        }

        public Criteria andIsPayedIsNull() {
            addCriterion("is_payed is null");
            return (Criteria) this;
        }

        public Criteria andIsPayedIsNotNull() {
            addCriterion("is_payed is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayedEqualTo(Short value) {
            addCriterion("is_payed =", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotEqualTo(Short value) {
            addCriterion("is_payed <>", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedGreaterThan(Short value) {
            addCriterion("is_payed >", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedGreaterThanOrEqualTo(Short value) {
            addCriterion("is_payed >=", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLessThan(Short value) {
            addCriterion("is_payed <", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLessThanOrEqualTo(Short value) {
            addCriterion("is_payed <=", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedIn(List<Short> values) {
            addCriterion("is_payed in", values, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotIn(List<Short> values) {
            addCriterion("is_payed not in", values, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedBetween(Short value1, Short value2) {
            addCriterion("is_payed between", value1, value2, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotBetween(Short value1, Short value2) {
            addCriterion("is_payed not between", value1, value2, "isPayed");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayIsNull() {
            addCriterion("allow_defer_day is null");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayIsNotNull() {
            addCriterion("allow_defer_day is not null");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayEqualTo(Short value) {
            addCriterion("allow_defer_day =", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayNotEqualTo(Short value) {
            addCriterion("allow_defer_day <>", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayGreaterThan(Short value) {
            addCriterion("allow_defer_day >", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayGreaterThanOrEqualTo(Short value) {
            addCriterion("allow_defer_day >=", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayLessThan(Short value) {
            addCriterion("allow_defer_day <", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayLessThanOrEqualTo(Short value) {
            addCriterion("allow_defer_day <=", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayIn(List<Short> values) {
            addCriterion("allow_defer_day in", values, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayNotIn(List<Short> values) {
            addCriterion("allow_defer_day not in", values, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayBetween(Short value1, Short value2) {
            addCriterion("allow_defer_day between", value1, value2, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayNotBetween(Short value1, Short value2) {
            addCriterion("allow_defer_day not between", value1, value2, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayIsNull() {
            addCriterion("month_bill_day is null");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayIsNotNull() {
            addCriterion("month_bill_day is not null");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayEqualTo(Short value) {
            addCriterion("month_bill_day =", value, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayNotEqualTo(Short value) {
            addCriterion("month_bill_day <>", value, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayGreaterThan(Short value) {
            addCriterion("month_bill_day >", value, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayGreaterThanOrEqualTo(Short value) {
            addCriterion("month_bill_day >=", value, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayLessThan(Short value) {
            addCriterion("month_bill_day <", value, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayLessThanOrEqualTo(Short value) {
            addCriterion("month_bill_day <=", value, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayIn(List<Short> values) {
            addCriterion("month_bill_day in", values, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayNotIn(List<Short> values) {
            addCriterion("month_bill_day not in", values, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayBetween(Short value1, Short value2) {
            addCriterion("month_bill_day between", value1, value2, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthBillDayNotBetween(Short value1, Short value2) {
            addCriterion("month_bill_day not between", value1, value2, "monthBillDay");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNull() {
            addCriterion("trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNotNull() {
            addCriterion("trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusEqualTo(Integer value) {
            addCriterion("trade_status =", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotEqualTo(Integer value) {
            addCriterion("trade_status <>", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThan(Integer value) {
            addCriterion("trade_status >", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_status >=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThan(Integer value) {
            addCriterion("trade_status <", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("trade_status <=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIn(List<Integer> values) {
            addCriterion("trade_status in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotIn(List<Integer> values) {
            addCriterion("trade_status not in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusBetween(Integer value1, Integer value2) {
            addCriterion("trade_status between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_status not between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNull() {
            addCriterion("charge_status is null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNotNull() {
            addCriterion("charge_status is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusEqualTo(Short value) {
            addCriterion("charge_status =", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotEqualTo(Short value) {
            addCriterion("charge_status <>", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThan(Short value) {
            addCriterion("charge_status >", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("charge_status >=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThan(Short value) {
            addCriterion("charge_status <", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThanOrEqualTo(Short value) {
            addCriterion("charge_status <=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIn(List<Short> values) {
            addCriterion("charge_status in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotIn(List<Short> values) {
            addCriterion("charge_status not in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusBetween(Short value1, Short value2) {
            addCriterion("charge_status between", value1, value2, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotBetween(Short value1, Short value2) {
            addCriterion("charge_status not between", value1, value2, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeIsNull() {
            addCriterion("pay_bill_type is null");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeIsNotNull() {
            addCriterion("pay_bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeEqualTo(Short value) {
            addCriterion("pay_bill_type =", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeNotEqualTo(Short value) {
            addCriterion("pay_bill_type <>", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeGreaterThan(Short value) {
            addCriterion("pay_bill_type >", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_bill_type >=", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeLessThan(Short value) {
            addCriterion("pay_bill_type <", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeLessThanOrEqualTo(Short value) {
            addCriterion("pay_bill_type <=", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeIn(List<Short> values) {
            addCriterion("pay_bill_type in", values, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeNotIn(List<Short> values) {
            addCriterion("pay_bill_type not in", values, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeBetween(Short value1, Short value2) {
            addCriterion("pay_bill_type between", value1, value2, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeNotBetween(Short value1, Short value2) {
            addCriterion("pay_bill_type not between", value1, value2, "payBillType");
            return (Criteria) this;
        }

        public Criteria andLoanerIdIsNull() {
            addCriterion("loaner_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanerIdIsNotNull() {
            addCriterion("loaner_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanerIdEqualTo(Integer value) {
            addCriterion("loaner_id =", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdNotEqualTo(Integer value) {
            addCriterion("loaner_id <>", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdGreaterThan(Integer value) {
            addCriterion("loaner_id >", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loaner_id >=", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdLessThan(Integer value) {
            addCriterion("loaner_id <", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdLessThanOrEqualTo(Integer value) {
            addCriterion("loaner_id <=", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdIn(List<Integer> values) {
            addCriterion("loaner_id in", values, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdNotIn(List<Integer> values) {
            addCriterion("loaner_id not in", values, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdBetween(Integer value1, Integer value2) {
            addCriterion("loaner_id between", value1, value2, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loaner_id not between", value1, value2, "loanerId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdIsNull() {
            addCriterion("guarantee_id is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdIsNotNull() {
            addCriterion("guarantee_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdEqualTo(Integer value) {
            addCriterion("guarantee_id =", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdNotEqualTo(Integer value) {
            addCriterion("guarantee_id <>", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdGreaterThan(Integer value) {
            addCriterion("guarantee_id >", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guarantee_id >=", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdLessThan(Integer value) {
            addCriterion("guarantee_id <", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdLessThanOrEqualTo(Integer value) {
            addCriterion("guarantee_id <=", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdIn(List<Integer> values) {
            addCriterion("guarantee_id in", values, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdNotIn(List<Integer> values) {
            addCriterion("guarantee_id not in", values, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdBetween(Integer value1, Integer value2) {
            addCriterion("guarantee_id between", value1, value2, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guarantee_id not between", value1, value2, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIsNull() {
            addCriterion("max_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIsNotNull() {
            addCriterion("max_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountEqualTo(Long value) {
            addCriterion("max_invest_amount =", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotEqualTo(Long value) {
            addCriterion("max_invest_amount <>", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountGreaterThan(Long value) {
            addCriterion("max_invest_amount >", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("max_invest_amount >=", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountLessThan(Long value) {
            addCriterion("max_invest_amount <", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountLessThanOrEqualTo(Long value) {
            addCriterion("max_invest_amount <=", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIn(List<Long> values) {
            addCriterion("max_invest_amount in", values, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotIn(List<Long> values) {
            addCriterion("max_invest_amount not in", values, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountBetween(Long value1, Long value2) {
            addCriterion("max_invest_amount between", value1, value2, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotBetween(Long value1, Long value2) {
            addCriterion("max_invest_amount not between", value1, value2, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andIsinvestIsNull() {
            addCriterion("isinvest is null");
            return (Criteria) this;
        }

        public Criteria andIsinvestIsNotNull() {
            addCriterion("isinvest is not null");
            return (Criteria) this;
        }

        public Criteria andIsinvestEqualTo(String value) {
            addCriterion("isinvest =", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestNotEqualTo(String value) {
            addCriterion("isinvest <>", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestGreaterThan(String value) {
            addCriterion("isinvest >", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestGreaterThanOrEqualTo(String value) {
            addCriterion("isinvest >=", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestLessThan(String value) {
            addCriterion("isinvest <", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestLessThanOrEqualTo(String value) {
            addCriterion("isinvest <=", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestLike(String value) {
            addCriterion("isinvest like", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestNotLike(String value) {
            addCriterion("isinvest not like", value, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestIn(List<String> values) {
            addCriterion("isinvest in", values, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestNotIn(List<String> values) {
            addCriterion("isinvest not in", values, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestBetween(String value1, String value2) {
            addCriterion("isinvest between", value1, value2, "isinvest");
            return (Criteria) this;
        }

        public Criteria andIsinvestNotBetween(String value1, String value2) {
            addCriterion("isinvest not between", value1, value2, "isinvest");
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