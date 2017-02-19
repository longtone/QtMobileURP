package com.stonelee.qt.school.urp.bean;

import java.util.List;

/**
 * Created by mac on 2017/2/15.
 */

public class LoginBean {

    /**
     * operMark : success
     * jsessionid : abcZSEUy_Be_8g2CfW-Ov
     * userRole : 1,
     * realName : 周玉涛
     * ywxm :
     * userName : 201424096
     * zxjxjhh : 2016-2017-2-1
     * zxjxjhJSON : {"bz":"","kxrq":"20170227","xndm":"2016-2017","xnmc":"2016-2017学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2016-2017-2-1","zxjxjhm":"2016-2017学年第二学期(两学期)"}
     * jcsjbList : [{"jc":11,"jclxdm":"01","jcmc":"十一","jssj":"2150","kssj":"2100","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":1,"jclxdm":"01","jcmc":"一","jssj":"0850","kssj":"0800","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":2,"jclxdm":"01","jcmc":"二","jssj":"0950","kssj":"0900","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":3,"jclxdm":"01","jcmc":"三","jssj":"1100","kssj":"1010","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":4,"jclxdm":"01","jcmc":"四","jssj":"1200","kssj":"1110","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":5,"jclxdm":"01","jcmc":"五","jssj":"1450","kssj":"1400","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":6,"jclxdm":"01","jcmc":"六","jssj":"1550","kssj":"1500","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":7,"jclxdm":"01","jcmc":"七","jssj":"1700","kssj":"1610","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":8,"jclxdm":"01","jcmc":"八","jssj":"1800","kssj":"1710","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":9,"jclxdm":"01","jcmc":"九","jssj":"1950","kssj":"1900","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1},{"jc":10,"jclxdm":"01","jcmc":"十","jssj":"2050","kssj":"2000","sjcd":"50","xqdm":"2","xqlxdm":"1","yxj":1}]
     * dayJc : {"swjc":4,"tjc":11,"wsjc":3,"xwjc":4}
     * zxjxjhbList : [{"bz":"","kxrq":"20040910","xndm":"2004-2005","xnmc":"2004-2005学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2004-2005-1-1","zxjxjhm":"2004-2005学年第一学期(两学期)"},{"bz":"","kxrq":"20050310","xndm":"2004-2005","xnmc":"2004-2005学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2004-2005-2-1","zxjxjhm":"2004-2005学年第二学期(两学期)"},{"bz":"","kxrq":"20050910","xndm":"2005-2006","xnmc":"2005-2006学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2005-2006-1-1","zxjxjhm":"2005-2006学年第一学期(两学期)"},{"bz":"","kxrq":"20060310","xndm":"2005-2006","xnmc":"2005-2006学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2005-2006-2-1","zxjxjhm":"2005-2006学年第二学期(两学期)"},{"bz":"","kxrq":"20060910","xndm":"2006-2007","xnmc":"2006-2007学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2006-2007-1-1","zxjxjhm":"2006-2007学年第一学期(两学期)"},{"bz":"","kxrq":"20070310","xndm":"2006-2007","xnmc":"2006-2007学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2006-2007-2-1","zxjxjhm":"2006-2007学年第二学期(两学期)"},{"bz":"","kxrq":"20070910","xndm":"2007-2008","xnmc":"2007-2008学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2007-2008-1-1","zxjxjhm":"2007-2008学年第一学期(两学期)"},{"bz":"","kxrq":"20080310","xndm":"2007-2008","xnmc":"2007-2008学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2007-2008-2-1","zxjxjhm":"2007-2008学年第二学期(两学期)"},{"bz":"","kxrq":"20080910","xndm":"2008-2009","xnmc":"2008-2009学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2008-2009-1-1","zxjxjhm":"2008-2009学年第一学期(两学期)"},{"bz":"","kxrq":"20090310","xndm":"2008-2009","xnmc":"2008-2009学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2008-2009-2-1","zxjxjhm":"2008-2009学年第二学期(两学期)"},{"bz":"","kxrq":"20090910","xndm":"2009-2010","xnmc":"2009-2010学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2009-2010-1-1","zxjxjhm":"2009-2010学年第一学期(两学期)"},{"bz":"","kxrq":"20090310","xndm":"2009-2010","xnmc":"2009-2010学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2009-2010-2-1","zxjxjhm":"2009-2010学年第二学期(两学期)"},{"bz":"","kxrq":"20100830","xndm":"2010-2011","xnmc":"2010-2011学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2010-2011-1-1","zxjxjhm":"2010-2011学年第一学期(两学期)"},{"bz":"","kxrq":"20110307","xndm":"2010-2011","xnmc":"2010-2011学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2010-2011-2-1","zxjxjhm":"2010-2011学年第二学期(两学期)"},{"bz":"","kxrq":"20110829","xndm":"2011-2012","xnmc":"2011-2012学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2011-2012-1-1","zxjxjhm":"2011-2012学年第一学期(两学期)"},{"bz":"","kxrq":"20120227","xndm":"2011-2012","xnmc":"2011-2012学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2011-2012-2-1","zxjxjhm":"2011-2012学年第二学期(两学期)"},{"bz":"","kxrq":"20120903","xndm":"2012-2013","xnmc":"2012-2013学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2012-2013-1-1","zxjxjhm":"2012-2013学年第一学期(两学期)"},{"bz":"","kxrq":"20130304","xndm":"2012-2013","xnmc":"2012-2013学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2012-2013-2-1","zxjxjhm":"2012-2013学年第二学期(两学期)"},{"bz":"","kxrq":"20130902","xndm":"2013-2014","xnmc":"2013-2014学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2013-2014-1-1","zxjxjhm":"2013-2014学年第一学期(两学期)"},{"bz":"","kxrq":"20140303","xndm":"2013-2014","xnmc":"2013-2014学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2013-2014-2-1","zxjxjhm":"2013-2014学年第二学期(两学期)"},{"bz":"","kxrq":"20140901","xndm":"2014-2015","xnmc":"2014-2015学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2014-2015-1-1","zxjxjhm":"2014-2015学年第一学期(两学期)"},{"bz":"","kxrq":"20150309","xndm":"2014-2015","xnmc":"2014-2015学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2014-2015-2-1","zxjxjhm":"2014-2015学年第二学期(两学期)"},{"bz":"","kxrq":"20150831","xndm":"2015-2016","xnmc":"2015-2016学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2015-2016-1-1","zxjxjhm":"2015-2016学年第一学期(两学期)"},{"bz":"","kxrq":"20160229","xndm":"2015-2016","xnmc":"2015-2016学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2015-2016-2-1","zxjxjhm":"2015-2016学年第二学期(两学期)"},{"bz":"","kxrq":"20160829","xndm":"2016-2017","xnmc":"2016-2017学年","xqdm":"1","xqlxdm":"1","xqlxm":"两学期","xqm":"第一学期","zxjxjhh":"2016-2017-1-1","zxjxjhm":"2016-2017学年第一学期(两学期)"},{"bz":"","kxrq":"20170227","xndm":"2016-2017","xnmc":"2016-2017学年","xqdm":"2","xqlxdm":"1","xqlxm":"两学期","xqm":"第二学期","zxjxjhh":"2016-2017-2-1","zxjxjhm":"2016-2017学年第二学期(两学期)"}]
     * kxrq : 20170227
     * xqm : 第二学期
     */

    private String operMark;
    private String jsessionid;
    private String userRole;
    private String realName;
    private String ywxm;
    private String userName;
    private String zxjxjhh;
    private ZxjxjhJSONBean zxjxjhJSON;
    private DayJcBean dayJc;
    private String kxrq;
    private String xqm;
    private List<JcsjbListBean> jcsjbList;
    private List<ZxjxjhbListBean> zxjxjhbList;

    public String getOperMark() {
        return operMark;
    }

    public void setOperMark(String operMark) {
        this.operMark = operMark;
    }

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getYwxm() {
        return ywxm;
    }

    public void setYwxm(String ywxm) {
        this.ywxm = ywxm;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getZxjxjhh() {
        return zxjxjhh;
    }

    public void setZxjxjhh(String zxjxjhh) {
        this.zxjxjhh = zxjxjhh;
    }

    public ZxjxjhJSONBean getZxjxjhJSON() {
        return zxjxjhJSON;
    }

    public void setZxjxjhJSON(ZxjxjhJSONBean zxjxjhJSON) {
        this.zxjxjhJSON = zxjxjhJSON;
    }

    public DayJcBean getDayJc() {
        return dayJc;
    }

    public void setDayJc(DayJcBean dayJc) {
        this.dayJc = dayJc;
    }

    public String getKxrq() {
        return kxrq;
    }

    public void setKxrq(String kxrq) {
        this.kxrq = kxrq;
    }

    public String getXqm() {
        return xqm;
    }

    public void setXqm(String xqm) {
        this.xqm = xqm;
    }

    public List<JcsjbListBean> getJcsjbList() {
        return jcsjbList;
    }

    public void setJcsjbList(List<JcsjbListBean> jcsjbList) {
        this.jcsjbList = jcsjbList;
    }

    public List<ZxjxjhbListBean> getZxjxjhbList() {
        return zxjxjhbList;
    }

    public void setZxjxjhbList(List<ZxjxjhbListBean> zxjxjhbList) {
        this.zxjxjhbList = zxjxjhbList;
    }

    public static class ZxjxjhJSONBean {
        /**
         * bz :
         * kxrq : 20170227
         * xndm : 2016-2017
         * xnmc : 2016-2017学年
         * xqdm : 2
         * xqlxdm : 1
         * xqlxm : 两学期
         * xqm : 第二学期
         * zxjxjhh : 2016-2017-2-1
         * zxjxjhm : 2016-2017学年第二学期(两学期)
         */

        private String bz;
        private String kxrq;
        private String xndm;
        private String xnmc;
        private String xqdm;
        private String xqlxdm;
        private String xqlxm;
        private String xqm;
        private String zxjxjhh;
        private String zxjxjhm;

        public String getBz() {
            return bz;
        }

        public void setBz(String bz) {
            this.bz = bz;
        }

        public String getKxrq() {
            return kxrq;
        }

        public void setKxrq(String kxrq) {
            this.kxrq = kxrq;
        }

        public String getXndm() {
            return xndm;
        }

        public void setXndm(String xndm) {
            this.xndm = xndm;
        }

        public String getXnmc() {
            return xnmc;
        }

        public void setXnmc(String xnmc) {
            this.xnmc = xnmc;
        }

        public String getXqdm() {
            return xqdm;
        }

        public void setXqdm(String xqdm) {
            this.xqdm = xqdm;
        }

        public String getXqlxdm() {
            return xqlxdm;
        }

        public void setXqlxdm(String xqlxdm) {
            this.xqlxdm = xqlxdm;
        }

        public String getXqlxm() {
            return xqlxm;
        }

        public void setXqlxm(String xqlxm) {
            this.xqlxm = xqlxm;
        }

        public String getXqm() {
            return xqm;
        }

        public void setXqm(String xqm) {
            this.xqm = xqm;
        }

        public String getZxjxjhh() {
            return zxjxjhh;
        }

        public void setZxjxjhh(String zxjxjhh) {
            this.zxjxjhh = zxjxjhh;
        }

        public String getZxjxjhm() {
            return zxjxjhm;
        }

        public void setZxjxjhm(String zxjxjhm) {
            this.zxjxjhm = zxjxjhm;
        }
    }

    public static class DayJcBean {
        /**
         * swjc : 4
         * tjc : 11
         * wsjc : 3
         * xwjc : 4
         */

        private int swjc;
        private int tjc;
        private int wsjc;
        private int xwjc;

        public int getSwjc() {
            return swjc;
        }

        public void setSwjc(int swjc) {
            this.swjc = swjc;
        }

        public int getTjc() {
            return tjc;
        }

        public void setTjc(int tjc) {
            this.tjc = tjc;
        }

        public int getWsjc() {
            return wsjc;
        }

        public void setWsjc(int wsjc) {
            this.wsjc = wsjc;
        }

        public int getXwjc() {
            return xwjc;
        }

        public void setXwjc(int xwjc) {
            this.xwjc = xwjc;
        }
    }

    public static class JcsjbListBean {
        /**
         * jc : 11
         * jclxdm : 01
         * jcmc : 十一
         * jssj : 2150
         * kssj : 2100
         * sjcd : 50
         * xqdm : 2
         * xqlxdm : 1
         * yxj : 1
         */

        private int jc;
        private String jclxdm;
        private String jcmc;
        private String jssj;
        private String kssj;
        private String sjcd;
        private String xqdm;
        private String xqlxdm;
        private int yxj;

        public int getJc() {
            return jc;
        }

        public void setJc(int jc) {
            this.jc = jc;
        }

        public String getJclxdm() {
            return jclxdm;
        }

        public void setJclxdm(String jclxdm) {
            this.jclxdm = jclxdm;
        }

        public String getJcmc() {
            return jcmc;
        }

        public void setJcmc(String jcmc) {
            this.jcmc = jcmc;
        }

        public String getJssj() {
            return jssj;
        }

        public void setJssj(String jssj) {
            this.jssj = jssj;
        }

        public String getKssj() {
            return kssj;
        }

        public void setKssj(String kssj) {
            this.kssj = kssj;
        }

        public String getSjcd() {
            return sjcd;
        }

        public void setSjcd(String sjcd) {
            this.sjcd = sjcd;
        }

        public String getXqdm() {
            return xqdm;
        }

        public void setXqdm(String xqdm) {
            this.xqdm = xqdm;
        }

        public String getXqlxdm() {
            return xqlxdm;
        }

        public void setXqlxdm(String xqlxdm) {
            this.xqlxdm = xqlxdm;
        }

        public int getYxj() {
            return yxj;
        }

        public void setYxj(int yxj) {
            this.yxj = yxj;
        }
    }

    public static class ZxjxjhbListBean {
        /**
         * bz :
         * kxrq : 20040910
         * xndm : 2004-2005
         * xnmc : 2004-2005学年
         * xqdm : 1
         * xqlxdm : 1
         * xqlxm : 两学期
         * xqm : 第一学期
         * zxjxjhh : 2004-2005-1-1
         * zxjxjhm : 2004-2005学年第一学期(两学期)
         */

        private String bz;
        private String kxrq;
        private String xndm;
        private String xnmc;
        private String xqdm;
        private String xqlxdm;
        private String xqlxm;
        private String xqm;
        private String zxjxjhh;
        private String zxjxjhm;

        public String getBz() {
            return bz;
        }

        public void setBz(String bz) {
            this.bz = bz;
        }

        public String getKxrq() {
            return kxrq;
        }

        public void setKxrq(String kxrq) {
            this.kxrq = kxrq;
        }

        public String getXndm() {
            return xndm;
        }

        public void setXndm(String xndm) {
            this.xndm = xndm;
        }

        public String getXnmc() {
            return xnmc;
        }

        public void setXnmc(String xnmc) {
            this.xnmc = xnmc;
        }

        public String getXqdm() {
            return xqdm;
        }

        public void setXqdm(String xqdm) {
            this.xqdm = xqdm;
        }

        public String getXqlxdm() {
            return xqlxdm;
        }

        public void setXqlxdm(String xqlxdm) {
            this.xqlxdm = xqlxdm;
        }

        public String getXqlxm() {
            return xqlxm;
        }

        public void setXqlxm(String xqlxm) {
            this.xqlxm = xqlxm;
        }

        public String getXqm() {
            return xqm;
        }

        public void setXqm(String xqm) {
            this.xqm = xqm;
        }

        public String getZxjxjhh() {
            return zxjxjhh;
        }

        public void setZxjxjhh(String zxjxjhh) {
            this.zxjxjhh = zxjxjhh;
        }

        public String getZxjxjhm() {
            return zxjxjhm;
        }

        public void setZxjxjhm(String zxjxjhm) {
            this.zxjxjhm = zxjxjhm;
        }
    }
}
