package com.stonelee.qt.school.urp.bean;

import java.util.List;

/**
 * Created by mac on 2017/2/15.
 */

public class GradeBean {
    public static void main(String[] args){
        AllGrade allGrade=new AllGrade();
        //allGrade.getQbcjxx().get(0).getCjList().
    }
    static class AllGrade{



        private String operMark;
        private List<QbcjxxBean> qbcjxx;

        public String getOperMark() {
            return operMark;
        }

        public void setOperMark(String operMark) {
            this.operMark = operMark;
        }

        public List<QbcjxxBean> getQbcjxx() {
            return qbcjxx;
        }

        public void setQbcjxx(List<QbcjxxBean> qbcjxx) {
            this.qbcjxx = qbcjxx;
        }

        public static class QbcjxxBean {


            private String cjbh;
            private String cjlx;
            private int fajhnkcms;
            private int fajhwkcms;
            private int fajhzms;
            private int fajhzxf;
            private int fajhzxs;
            private int kznzms;
            private int kztgms;
            private int kzwtgms;
            private int kzxdms;
            private int tgms;
            private int wtgms;
            private int xqtgms;
            private int xqwtg;
            private int xqzms;
            private int xqzxf;
            private int xqzxs;
            private int yqxf;
            private int yqxs;
            private int yxxf;
            private int zms;
            private int zxf;
            private int zxs;
            private List<CjListBean> cjList;

            public String getCjbh() {
                return cjbh;
            }

            public void setCjbh(String cjbh) {
                this.cjbh = cjbh;
            }

            public String getCjlx() {
                return cjlx;
            }

            public void setCjlx(String cjlx) {
                this.cjlx = cjlx;
            }

            public int getFajhnkcms() {
                return fajhnkcms;
            }

            public void setFajhnkcms(int fajhnkcms) {
                this.fajhnkcms = fajhnkcms;
            }

            public int getFajhwkcms() {
                return fajhwkcms;
            }

            public void setFajhwkcms(int fajhwkcms) {
                this.fajhwkcms = fajhwkcms;
            }

            public int getFajhzms() {
                return fajhzms;
            }

            public void setFajhzms(int fajhzms) {
                this.fajhzms = fajhzms;
            }

            public int getFajhzxf() {
                return fajhzxf;
            }

            public void setFajhzxf(int fajhzxf) {
                this.fajhzxf = fajhzxf;
            }

            public int getFajhzxs() {
                return fajhzxs;
            }

            public void setFajhzxs(int fajhzxs) {
                this.fajhzxs = fajhzxs;
            }

            public int getKznzms() {
                return kznzms;
            }

            public void setKznzms(int kznzms) {
                this.kznzms = kznzms;
            }

            public int getKztgms() {
                return kztgms;
            }

            public void setKztgms(int kztgms) {
                this.kztgms = kztgms;
            }

            public int getKzwtgms() {
                return kzwtgms;
            }

            public void setKzwtgms(int kzwtgms) {
                this.kzwtgms = kzwtgms;
            }

            public int getKzxdms() {
                return kzxdms;
            }

            public void setKzxdms(int kzxdms) {
                this.kzxdms = kzxdms;
            }

            public int getTgms() {
                return tgms;
            }

            public void setTgms(int tgms) {
                this.tgms = tgms;
            }

            public int getWtgms() {
                return wtgms;
            }

            public void setWtgms(int wtgms) {
                this.wtgms = wtgms;
            }

            public int getXqtgms() {
                return xqtgms;
            }

            public void setXqtgms(int xqtgms) {
                this.xqtgms = xqtgms;
            }

            public int getXqwtg() {
                return xqwtg;
            }

            public void setXqwtg(int xqwtg) {
                this.xqwtg = xqwtg;
            }

            public int getXqzms() {
                return xqzms;
            }

            public void setXqzms(int xqzms) {
                this.xqzms = xqzms;
            }

            public int getXqzxf() {
                return xqzxf;
            }

            public void setXqzxf(int xqzxf) {
                this.xqzxf = xqzxf;
            }

            public int getXqzxs() {
                return xqzxs;
            }

            public void setXqzxs(int xqzxs) {
                this.xqzxs = xqzxs;
            }

            public int getYqxf() {
                return yqxf;
            }

            public void setYqxf(int yqxf) {
                this.yqxf = yqxf;
            }

            public int getYqxs() {
                return yqxs;
            }

            public void setYqxs(int yqxs) {
                this.yqxs = yqxs;
            }

            public int getYxxf() {
                return yxxf;
            }

            public void setYxxf(int yxxf) {
                this.yxxf = yxxf;
            }

            public int getZms() {
                return zms;
            }

            public void setZms(int zms) {
                this.zms = zms;
            }

            public int getZxf() {
                return zxf;
            }

            public void setZxf(int zxf) {
                this.zxf = zxf;
            }

            public int getZxs() {
                return zxs;
            }

            public void setZxs(int zxs) {
                this.zxs = zxs;
            }

            public List<CjListBean> getCjList() {
                return cjList;
            }

            public void setCjList(List<CjListBean> cjList) {
                this.cjList = cjList;
            }

            public static class CjListBean {
                /**
                 * bfdjcj : 0
                 * bkfsdm :
                 * bm :
                 * bz :
                 * bzcj : 0
                 * cj : 88.0
                 * cjlrfsdm : 001
                 * cxbkbz :
                 * czr : 120036
                 * czsj : 20150123162555
                 * djcj : -80
                 * djm : 良
                 * fajhh : 4775
                 * famc : 交通运输
                 * id : {"kch":"BK0000020","kch_zj":"BK0000020","kssj":"20141222","kxh":"07","xh":"201424096","zxjxjhh":"2014-2015-1-1"}
                 * jdcj : 4.3
                 * jhmc : 交通运输的指导教学计划
                 * kccj : 88
                 * kch :
                 * kcm : 军事理论课
                 * kcsxdm : 001
                 * kcsxmc : 必修
                 * kslxdm : 0
                 * kssj :
                 * kxh :
                 * lrztdm :
                 * lrztsm :
                 * rxklxdm :
                 * tcj : 0
                 * tdkch :
                 * tdkcm :
                 * wtgyydm :
                 * xdfsdm : 01
                 * xf : 1
                 * xh :
                 * xkcsxdm :
                 * xkcsxmc :
                 * xndm : 2014-2015
                 * xqdm : 1
                 * xqlxdm : 1
                 * xqlxm : 两学期
                 * xqm : 第一学期
                 * xs : 16
                 * ywkcm : Military Theory
                 * zxjxjhh :
                 */

                private int bfdjcj;
                private String bkfsdm;
                private String bm;
                private String bz;
                private int bzcj;
                private String cj;
                private String cjlrfsdm;
                private String cxbkbz;
                private String czr;
                private String czsj;
                private int djcj;
                private String djm;
                private String fajhh;
                private String famc;
                private IdBean id;
                private double jdcj;
                private String jhmc;
                private int kccj;
                private String kch;
                private String kcm;
                private String kcsxdm;
                private String kcsxmc;
                private String kslxdm;
                private String kssj;
                private String kxh;
                private String lrztdm;
                private String lrztsm;
                private String rxklxdm;
                private int tcj;
                private String tdkch;
                private String tdkcm;
                private String wtgyydm;
                private String xdfsdm;
                private String xf;
                private String xh;
                private String xkcsxdm;
                private String xkcsxmc;
                private String xndm;
                private String xqdm;
                private String xqlxdm;
                private String xqlxm;
                private String xqm;
                private String xs;
                private String ywkcm;
                private String zxjxjhh;

                public int getBfdjcj() {
                    return bfdjcj;
                }

                public void setBfdjcj(int bfdjcj) {
                    this.bfdjcj = bfdjcj;
                }

                public String getBkfsdm() {
                    return bkfsdm;
                }

                public void setBkfsdm(String bkfsdm) {
                    this.bkfsdm = bkfsdm;
                }

                public String getBm() {
                    return bm;
                }

                public void setBm(String bm) {
                    this.bm = bm;
                }

                public String getBz() {
                    return bz;
                }

                public void setBz(String bz) {
                    this.bz = bz;
                }

                public int getBzcj() {
                    return bzcj;
                }

                public void setBzcj(int bzcj) {
                    this.bzcj = bzcj;
                }

                public String getCj() {
                    return cj;
                }

                public void setCj(String cj) {
                    this.cj = cj;
                }

                public String getCjlrfsdm() {
                    return cjlrfsdm;
                }

                public void setCjlrfsdm(String cjlrfsdm) {
                    this.cjlrfsdm = cjlrfsdm;
                }

                public String getCxbkbz() {
                    return cxbkbz;
                }

                public void setCxbkbz(String cxbkbz) {
                    this.cxbkbz = cxbkbz;
                }

                public String getCzr() {
                    return czr;
                }

                public void setCzr(String czr) {
                    this.czr = czr;
                }

                public String getCzsj() {
                    return czsj;
                }

                public void setCzsj(String czsj) {
                    this.czsj = czsj;
                }

                public int getDjcj() {
                    return djcj;
                }

                public void setDjcj(int djcj) {
                    this.djcj = djcj;
                }

                public String getDjm() {
                    return djm;
                }

                public void setDjm(String djm) {
                    this.djm = djm;
                }

                public String getFajhh() {
                    return fajhh;
                }

                public void setFajhh(String fajhh) {
                    this.fajhh = fajhh;
                }

                public String getFamc() {
                    return famc;
                }

                public void setFamc(String famc) {
                    this.famc = famc;
                }

                public IdBean getId() {
                    return id;
                }

                public void setId(IdBean id) {
                    this.id = id;
                }

                public double getJdcj() {
                    return jdcj;
                }

                public void setJdcj(double jdcj) {
                    this.jdcj = jdcj;
                }

                public String getJhmc() {
                    return jhmc;
                }

                public void setJhmc(String jhmc) {
                    this.jhmc = jhmc;
                }

                public int getKccj() {
                    return kccj;
                }

                public void setKccj(int kccj) {
                    this.kccj = kccj;
                }

                public String getKch() {
                    return kch;
                }

                public void setKch(String kch) {
                    this.kch = kch;
                }

                public String getKcm() {
                    return kcm;
                }

                public void setKcm(String kcm) {
                    this.kcm = kcm;
                }

                public String getKcsxdm() {
                    return kcsxdm;
                }

                public void setKcsxdm(String kcsxdm) {
                    this.kcsxdm = kcsxdm;
                }

                public String getKcsxmc() {
                    return kcsxmc;
                }

                public void setKcsxmc(String kcsxmc) {
                    this.kcsxmc = kcsxmc;
                }

                public String getKslxdm() {
                    return kslxdm;
                }

                public void setKslxdm(String kslxdm) {
                    this.kslxdm = kslxdm;
                }

                public String getKssj() {
                    return kssj;
                }

                public void setKssj(String kssj) {
                    this.kssj = kssj;
                }

                public String getKxh() {
                    return kxh;
                }

                public void setKxh(String kxh) {
                    this.kxh = kxh;
                }

                public String getLrztdm() {
                    return lrztdm;
                }

                public void setLrztdm(String lrztdm) {
                    this.lrztdm = lrztdm;
                }

                public String getLrztsm() {
                    return lrztsm;
                }

                public void setLrztsm(String lrztsm) {
                    this.lrztsm = lrztsm;
                }

                public String getRxklxdm() {
                    return rxklxdm;
                }

                public void setRxklxdm(String rxklxdm) {
                    this.rxklxdm = rxklxdm;
                }

                public int getTcj() {
                    return tcj;
                }

                public void setTcj(int tcj) {
                    this.tcj = tcj;
                }

                public String getTdkch() {
                    return tdkch;
                }

                public void setTdkch(String tdkch) {
                    this.tdkch = tdkch;
                }

                public String getTdkcm() {
                    return tdkcm;
                }

                public void setTdkcm(String tdkcm) {
                    this.tdkcm = tdkcm;
                }

                public String getWtgyydm() {
                    return wtgyydm;
                }

                public void setWtgyydm(String wtgyydm) {
                    this.wtgyydm = wtgyydm;
                }

                public String getXdfsdm() {
                    return xdfsdm;
                }

                public void setXdfsdm(String xdfsdm) {
                    this.xdfsdm = xdfsdm;
                }

                public String getXf() {
                    return xf;
                }

                public void setXf(String xf) {
                    this.xf = xf;
                }

                public String getXh() {
                    return xh;
                }

                public void setXh(String xh) {
                    this.xh = xh;
                }

                public String getXkcsxdm() {
                    return xkcsxdm;
                }

                public void setXkcsxdm(String xkcsxdm) {
                    this.xkcsxdm = xkcsxdm;
                }

                public String getXkcsxmc() {
                    return xkcsxmc;
                }

                public void setXkcsxmc(String xkcsxmc) {
                    this.xkcsxmc = xkcsxmc;
                }

                public String getXndm() {
                    return xndm;
                }

                public void setXndm(String xndm) {
                    this.xndm = xndm;
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

                public String getXs() {
                    return xs;
                }

                public void setXs(String xs) {
                    this.xs = xs;
                }

                public String getYwkcm() {
                    return ywkcm;
                }

                public void setYwkcm(String ywkcm) {
                    this.ywkcm = ywkcm;
                }

                public String getZxjxjhh() {
                    return zxjxjhh;
                }

                public void setZxjxjhh(String zxjxjhh) {
                    this.zxjxjhh = zxjxjhh;
                }

                public static class IdBean {
                    /**
                     * kch : BK0000020
                     * kch_zj : BK0000020
                     * kssj : 20141222
                     * kxh : 07
                     * xh : 201424096
                     * zxjxjhh : 2014-2015-1-1
                     */

                    private String kch;
                    private String kch_zj;
                    private String kssj;
                    private String kxh;
                    private String xh;
                    private String zxjxjhh;

                    public String getKch() {
                        return kch;
                    }

                    public void setKch(String kch) {
                        this.kch = kch;
                    }

                    public String getKch_zj() {
                        return kch_zj;
                    }

                    public void setKch_zj(String kch_zj) {
                        this.kch_zj = kch_zj;
                    }

                    public String getKssj() {
                        return kssj;
                    }

                    public void setKssj(String kssj) {
                        this.kssj = kssj;
                    }

                    public String getKxh() {
                        return kxh;
                    }

                    public void setKxh(String kxh) {
                        this.kxh = kxh;
                    }

                    public String getXh() {
                        return xh;
                    }

                    public void setXh(String xh) {
                        this.xh = xh;
                    }

                    public String getZxjxjhh() {
                        return zxjxjhh;
                    }

                    public void setZxjxjhh(String zxjxjhh) {
                        this.zxjxjhh = zxjxjhh;
                    }
                }
            }
        }
    }
}
