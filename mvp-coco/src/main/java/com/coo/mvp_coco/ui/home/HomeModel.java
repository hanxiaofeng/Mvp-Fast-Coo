package com.coo.mvp_coco.ui.home;

import java.util.List;

public class HomeModel {


    /**
     * curPage : 1
     * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":76,"chapterName":"项目架构","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":13772,"link":"https://juejin.im/post/5ecb4174f265da7708476f12","niceDate":"4小时前","niceShareDate":"5小时前","origin":"","prefix":"","projectLink":"","publishTime":1591319174000,"selfVisible":0,"shareDate":1591317820000,"shareUser":"鸿洋","superChapterId":81,"superChapterName":"热门专题","tags":[],"title":"我是怎么把业务代码越写越复杂的 | MVP - MVVM - Clean Architecture","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":13773,"link":"https://www.jianshu.com/p/8093e9f64d8b","niceDate":"4小时前","niceShareDate":"4小时前","origin":"","prefix":"","projectLink":"","publishTime":1591319158000,"selfVisible":0,"shareDate":1591318132000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"WMRouter源码解析之Transform","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":13771,"link":"https://juejin.im/post/5ed72ba5f265da76d66c2a2f","niceDate":"5小时前","niceShareDate":"5小时前","origin":"","prefix":"","projectLink":"","publishTime":1591317700000,"selfVisible":0,"shareDate":1591317624000,"shareUser":"goweii","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"重学 Kotlin &mdash;&mdash; object，史上更 &ldquo;快&rdquo; 单例 ？","type":0,"userId":20382,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":252,"chapterName":"奇怪的Bug","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13749,"link":"https://juejin.im/post/5ed65846f265da771c77f1bc","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1591201028000,"selfVisible":0,"shareDate":1591169166000,"shareUser":"逮虾户","superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"一个一年没解决的ClassNotFoundException","type":0,"userId":63284,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":182,"chapterName":"JNI编程","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13757,"link":"https://juejin.im/post/5ed73d1e6fb9a047dd275995","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1591200994000,"selfVisible":0,"shareDate":1591199150000,"shareUser":"鸿洋","superChapterId":182,"superChapterName":"JNI","tags":[],"title":"Android JNI和NDK学习（三）：动态注册","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13768,"link":"https://mp.weixin.qq.com/s/Gj8fxXwQVAy7J9sOIp10xw","niceDate":"1天前","niceShareDate":"14小时前","origin":"","prefix":"","projectLink":"","publishTime":1591200000000,"selfVisible":0,"shareDate":1591282366000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Android MVP &amp;&amp; MVVM深度解析","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13769,"link":"https://mp.weixin.qq.com/s/wWB5ENo3eQJH03OXvoup8w","niceDate":"1天前","niceShareDate":"14小时前","origin":"","prefix":"","projectLink":"","publishTime":1591200000000,"selfVisible":0,"shareDate":1591282394000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"&ldquo;新技术&rdquo; 又又又又来了？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13770,"link":"https://mp.weixin.qq.com/s/kmvn637E56t1bae2jXgqfw","niceDate":"1天前","niceShareDate":"14小时前","origin":"","prefix":"","projectLink":"","publishTime":1591200000000,"selfVisible":0,"shareDate":1591282409000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android秀翻天的操作&mdash;&mdash;使用协程进行网络请求","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13752,"link":"https://mp.weixin.qq.com/s/YW1rGpH4vT5zmLMAS1T-mg","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195706000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"如何解决 if&hellip;else 过多的问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13753,"link":"https://mp.weixin.qq.com/s/eU25oon1I3MC-bCoiF9r8Q","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195734000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"插件化技术的演进之路","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13755,"link":"https://mp.weixin.qq.com/s/5U-nTNJp_7Z5J11Xyj17HA","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195778000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"巧用MVVM搭建GitHub客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":171,"chapterName":"binder","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13736,"link":"https://juejin.im/post/5ed64bbde51d4578732e75a1","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591106210000,"selfVisible":0,"shareDate":1591103036000,"shareUser":"Zaylour","superChapterId":173,"superChapterName":"framework","tags":[],"title":"浅析Binder","type":0,"userId":9778,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13737,"link":"https://www.jianshu.com/p/b799b63f29e2","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591104714000,"selfVisible":0,"shareDate":1591104229000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Coroutine 探索之旅","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13738,"link":"https://www.jianshu.com/p/c515efb9a075","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591104707000,"selfVisible":0,"shareDate":1591104299000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Vocabulary | 揭秘协程中的 suspend 修饰符","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":298,"chapterName":"我的博客","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13739,"link":"https://wanandroid.com/blog/show/2766","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591104700000,"selfVisible":0,"shareDate":1591104472000,"shareUser":"","superChapterId":298,"superChapterName":"原创文章","tags":[],"title":"Android  &quot;退一步&quot;的布局加载优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13727,"link":"https://juejin.im/post/5ed3219bf265da77190bbb9e","niceDate":"2020-06-02 09:52","niceShareDate":"2020-06-02 09:52","origin":"","prefix":"","projectLink":"","publishTime":1591062725000,"selfVisible":0,"shareDate":1591062725000,"shareUser":"程序有点猿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android插件化探索二","type":0,"userId":65389,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13741,"link":"https://mp.weixin.qq.com/s/W69qHo0bBuDgob4_WSkaSw","niceDate":"2020-06-02 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110070000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Android Studio 4.0+ 中新的 UI 层次结构调试工具","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13742,"link":"https://mp.weixin.qq.com/s/xrIlX7JMouyogTsc5oFeXw","niceDate":"2020-06-02 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110087000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Android 升级适配爬坑历程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13743,"link":"https://mp.weixin.qq.com/s/ceXsH06fUFa7y4lzi4uXzw","niceDate":"2020-06-02 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110106000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"&ldquo;手把手&rdquo;的性能优化文章来了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","canEdit":false,"chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13744,"link":"https://mp.weixin.qq.com/s/H-p2-JgHg-aldiXmXop4Rw","niceDate":"2020-06-02 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110121000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"如何实现一个高性能可渲染大数据的Tree组件","type":0,"userId":-1,"visible":1,"zan":0}]
     * offset : 0
     * over : false
     * pageCount : 431
     * size : 20
     * total : 8617
     */

    private int curPage;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;
    private List<ArticleInfo> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ArticleInfo> getDatas() {
        return datas;
    }

    public void setDatas(List<ArticleInfo> datas) {
        this.datas = datas;
    }

    public static class ArticleInfo {
        /**
         * apkLink :
         * audit : 1
         * author :
         * canEdit : false
         * chapterId : 76
         * chapterName : 项目架构
         * collect : false
         * courseId : 13
         * desc :
         * descMd :
         * envelopePic :
         * fresh : true
         * id : 13772
         * link : https://juejin.im/post/5ecb4174f265da7708476f12
         * niceDate : 4小时前
         * niceShareDate : 5小时前
         * origin :
         * prefix :
         * projectLink :
         * publishTime : 1591319174000
         * selfVisible : 0
         * shareDate : 1591317820000
         * shareUser : 鸿洋
         * superChapterId : 81
         * superChapterName : 热门专题
         * tags : []
         * title : 我是怎么把业务代码越写越复杂的 | MVP - MVVM - Clean Architecture
         * type : 0
         * userId : 2
         * visible : 1
         * zan : 0
         */

        private String apkLink;
        private int audit;
        private String author;
        private boolean canEdit;
        private int chapterId;
        private String chapterName;
        private boolean collect;
        private int courseId;
        private String desc;
        private String descMd;
        private String envelopePic;
        private boolean fresh;
        private int id;
        private String link;
        private String niceDate;
        private String niceShareDate;
        private String origin;
        private String prefix;
        private String projectLink;
        private long publishTime;
        private int selfVisible;
        private long shareDate;
        private String shareUser;
        private int superChapterId;
        private String superChapterName;
        private String title;
        private int type;
        private int userId;
        private int visible;
        private int zan;
        private List<?> tags;

        public String getApkLink() {
            return apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public int getAudit() {
            return audit;
        }

        public void setAudit(int audit) {
            this.audit = audit;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public boolean isCanEdit() {
            return canEdit;
        }

        public void setCanEdit(boolean canEdit) {
            this.canEdit = canEdit;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public boolean isCollect() {
            return collect;
        }

        public void setCollect(boolean collect) {
            this.collect = collect;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDescMd() {
            return descMd;
        }

        public void setDescMd(String descMd) {
            this.descMd = descMd;
        }

        public String getEnvelopePic() {
            return envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public boolean isFresh() {
            return fresh;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getNiceShareDate() {
            return niceShareDate;
        }

        public void setNiceShareDate(String niceShareDate) {
            this.niceShareDate = niceShareDate;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getProjectLink() {
            return projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getSelfVisible() {
            return selfVisible;
        }

        public void setSelfVisible(int selfVisible) {
            this.selfVisible = selfVisible;
        }

        public long getShareDate() {
            return shareDate;
        }

        public void setShareDate(long shareDate) {
            this.shareDate = shareDate;
        }

        public String getShareUser() {
            return shareUser;
        }

        public void setShareUser(String shareUser) {
            this.shareUser = shareUser;
        }

        public int getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        @Override
        public String toString() {
            return "ArticleInfo{" +
                    "apkLink='" + apkLink + '\'' +
                    ", audit=" + audit +
                    ", author='" + author + '\'' +
                    ", canEdit=" + canEdit +
                    ", chapterId=" + chapterId +
                    ", chapterName='" + chapterName + '\'' +
                    ", collect=" + collect +
                    ", courseId=" + courseId +
                    ", desc='" + desc + '\'' +
                    ", descMd='" + descMd + '\'' +
                    ", envelopePic='" + envelopePic + '\'' +
                    ", fresh=" + fresh +
                    ", id=" + id +
                    ", link='" + link + '\'' +
                    ", niceDate='" + niceDate + '\'' +
                    ", niceShareDate='" + niceShareDate + '\'' +
                    ", origin='" + origin + '\'' +
                    ", prefix='" + prefix + '\'' +
                    ", projectLink='" + projectLink + '\'' +
                    ", publishTime=" + publishTime +
                    ", selfVisible=" + selfVisible +
                    ", shareDate=" + shareDate +
                    ", shareUser='" + shareUser + '\'' +
                    ", superChapterId=" + superChapterId +
                    ", superChapterName='" + superChapterName + '\'' +
                    ", title='" + title + '\'' +
                    ", type=" + type +
                    ", userId=" + userId +
                    ", visible=" + visible +
                    ", zan=" + zan +
                    ", tags=" + tags +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HomeModel{" +
                "curPage=" + curPage +
                ", offset=" + offset +
                ", over=" + over +
                ", pageCount=" + pageCount +
                ", size=" + size +
                ", total=" + total +
                ", datas=" + datas +
                '}';
    }
}
