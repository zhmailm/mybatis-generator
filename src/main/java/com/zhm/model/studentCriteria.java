package com.zhm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class studentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public studentCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSbrithIsNull() {
            addCriterion("sbrith is null");
            return (Criteria) this;
        }

        public Criteria andSbrithIsNotNull() {
            addCriterion("sbrith is not null");
            return (Criteria) this;
        }

        public Criteria andSbrithEqualTo(Date value) {
            addCriterionForJDBCDate("sbrith =", value, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithNotEqualTo(Date value) {
            addCriterionForJDBCDate("sbrith <>", value, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithGreaterThan(Date value) {
            addCriterionForJDBCDate("sbrith >", value, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sbrith >=", value, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithLessThan(Date value) {
            addCriterionForJDBCDate("sbrith <", value, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sbrith <=", value, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithIn(List<Date> values) {
            addCriterionForJDBCDate("sbrith in", values, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithNotIn(List<Date> values) {
            addCriterionForJDBCDate("sbrith not in", values, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sbrith between", value1, value2, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSbrithNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sbrith not between", value1, value2, "sbrith");
            return (Criteria) this;
        }

        public Criteria andSadressIsNull() {
            addCriterion("sadress is null");
            return (Criteria) this;
        }

        public Criteria andSadressIsNotNull() {
            addCriterion("sadress is not null");
            return (Criteria) this;
        }

        public Criteria andSadressEqualTo(String value) {
            addCriterion("sadress =", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotEqualTo(String value) {
            addCriterion("sadress <>", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressGreaterThan(String value) {
            addCriterion("sadress >", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressGreaterThanOrEqualTo(String value) {
            addCriterion("sadress >=", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressLessThan(String value) {
            addCriterion("sadress <", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressLessThanOrEqualTo(String value) {
            addCriterion("sadress <=", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressLike(String value) {
            addCriterion("sadress like", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotLike(String value) {
            addCriterion("sadress not like", value, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressIn(List<String> values) {
            addCriterion("sadress in", values, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotIn(List<String> values) {
            addCriterion("sadress not in", values, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressBetween(String value1, String value2) {
            addCriterion("sadress between", value1, value2, "sadress");
            return (Criteria) this;
        }

        public Criteria andSadressNotBetween(String value1, String value2) {
            addCriterion("sadress not between", value1, value2, "sadress");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSlikesIsNull() {
            addCriterion("slikes is null");
            return (Criteria) this;
        }

        public Criteria andSlikesIsNotNull() {
            addCriterion("slikes is not null");
            return (Criteria) this;
        }

        public Criteria andSlikesEqualTo(String value) {
            addCriterion("slikes =", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesNotEqualTo(String value) {
            addCriterion("slikes <>", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesGreaterThan(String value) {
            addCriterion("slikes >", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesGreaterThanOrEqualTo(String value) {
            addCriterion("slikes >=", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesLessThan(String value) {
            addCriterion("slikes <", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesLessThanOrEqualTo(String value) {
            addCriterion("slikes <=", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesLike(String value) {
            addCriterion("slikes like", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesNotLike(String value) {
            addCriterion("slikes not like", value, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesIn(List<String> values) {
            addCriterion("slikes in", values, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesNotIn(List<String> values) {
            addCriterion("slikes not in", values, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesBetween(String value1, String value2) {
            addCriterion("slikes between", value1, value2, "slikes");
            return (Criteria) this;
        }

        public Criteria andSlikesNotBetween(String value1, String value2) {
            addCriterion("slikes not between", value1, value2, "slikes");
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