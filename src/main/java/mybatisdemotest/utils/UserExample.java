package mybatisdemotest.utils;

/**
 * @version 1.0
 * @class: UserExample
 * @Description:
 * @Author: Dazo
 * @date: 5/5/2023
 */


import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Sqls.Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Sqls.Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Sqls.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Sqls.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Sqls.Criteria or() {
        Sqls.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Sqls.Criteria createCriteria() {
        Sqls.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Sqls.Criteria createCriteriaInternal() {
        Sqls.Criteria criteria = new Sqls.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Example.Criterion> criteria;

        protected GeneratedCriteria() {
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Example.Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Example.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
//            boolean add = criteria.add(new Example.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
//            boolean add = criteria.add(new Example.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
//            criteria.add(new Example.Criterion(condition, value1, value2));
        }

//        public Sqls.Criteria andIdIsNull() {
//            addCriterion("id is null");
////            return (Sqls.Criteria) this;
//        }
//
//        public Sqls.Criteria andIdIsNotNull() {
//            addCriterion("id is not null");
//            return (Sqls.Criteria) this;
//        }

//        public Sqls.Criteria andIdEqualTo(Integer value) {
//            addCriterion("id =", value, "id");
//            return (Sqls.Criteria) this;
//        }

//        public Sqls.Criteria andIdNotEqualTo(Integer value) {
//            addCriterion("id <>", value, "id");
//            return (Sqls.Criteria) this;
//        }
//
//        public Sqls.Criteria andIdGreaterThan(Integer value) {
//            addCriterion("id >", value, "id");
//            return (Example.Criteria) this;
//        }

//        public Example.Criteria andIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("id >=", value, "id");
//            return (Example.Criteria) this;
//        }
//
//        public Example.Criteria andIdLessThan(Integer value) {
//            addCriterion("id <", value, "id");
//            return (Example.Criteria) this;
//        }

    }
}