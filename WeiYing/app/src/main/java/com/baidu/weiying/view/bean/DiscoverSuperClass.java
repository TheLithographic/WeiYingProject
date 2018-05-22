package com.baidu.weiying.view.bean;

import java.util.List;

/**
 * 发现页面的bean类
 */

public class DiscoverSuperClass {

    /**
     * msg : 成功
     * ret : {"adv":{"imgURL":"","dataId":"","htmlURL":"","shareURL":"","title":""},"pnum":8,"totalRecords":30,"bannerList":[],"records":30,"list":[{"airTime":2016,"duration":"00:01:33","loadtype":"video","score":0,"angleIcon":"","dataId":"c9d1eab1cb2d4ce2acf2bf6871cd3a84","description":"@TV新片速递：今日片方发布了\u201c狂欢\u201d版预告和海报。区别于传统严肃的硬汉形象，海报中头大身子小的飞虎队十分\u201c萌萌哒\u201d，他们表情夸张，与火车一起冲出五彩浓烟，极富喜感。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=c9d1eab1cb2d4ce2acf2bf6871cd3a84","shareURL":"http://m.svipmovie.com/#/moviedetails/c9d1eab1cb2d4ce2acf2bf6871cd3a84","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2016/12/12/1481537020044097544.jpg","title":"《铁道飞虎》狂欢版预告","roomId":""},{"airTime":2016,"duration":"00:02:48","loadtype":"video","score":0,"angleIcon":"","dataId":"c38c2bc84261425b9a1fa5be40c991f4","description":"@TV新片速递：由飞虎队合体演唱的主题曲《弹起我心爱的土琵琶》，MV中，黄子韬起头演唱\u201c西边的太阳就要落山了\u201d总是找不到调，被成龙嫌弃道：\u201c他在片场天天唱，烦死了。\u201d","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=c38c2bc84261425b9a1fa5be40c991f4","shareURL":"http://m.svipmovie.com/#/moviedetails/c38c2bc84261425b9a1fa5be40c991f4","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2016/12/10/1481339960058068889.jpg","title":"《铁道飞虎》主题曲","roomId":""},{"airTime":0,"duration":"00:00:52","loadtype":"video","score":0,"angleIcon":"","dataId":"81fd080cd2ab43288229873ab121a690","description":"@TV新片速递：《铁道飞虎》是由丁晟执导，成龙、黄子韬、王凯、王大陆等主演的动作、战争题材喜剧电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=81fd080cd2ab43288229873ab121a690","shareURL":"http://m.svipmovie.com/#/moviedetails/81fd080cd2ab43288229873ab121a690","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/1207/81fd080cd2ab43288229873ab121a690_168028_101.jpg","title":"铁道飞虎定档预告片","roomId":""},{"airTime":0,"duration":"00:01:02","loadtype":"video","score":0,"angleIcon":"","dataId":"6b87cb52a77d4b66aa47742f12c53d8f","description":"@TV新片速递：由姜武监制，梁栋执导，姜武、蒋勤勤领衔主演、李乃文、傅颖主演的奇幻穿越电影《完美有多美》发布\u201c奇幻人生\u201d先导预告。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=6b87cb52a77d4b66aa47742f12c53d8f","shareURL":"http://m.svipmovie.com/#/moviedetails/6b87cb52a77d4b66aa47742f12c53d8f","pic":"http://y1.cnliveimg.com:8080/image/itv/2016/1127/6b87cb52a77d4b66aa47742f12c53d8f_165267_101.jpg","title":"《完美有多美》预告片","roomId":""},{"airTime":0,"duration":"00:01:50","loadtype":"video","score":0,"angleIcon":"","dataId":"cb585132596f4a928e3b8d1ab9cba551","description":"@TV新片速递：2016年11月21日19:00，《你的名字。》红毯直播。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=cb585132596f4a928e3b8d1ab9cba551","shareURL":"http://m.svipmovie.com/#/moviedetails/cb585132596f4a928e3b8d1ab9cba551","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/1121/cb585132596f4a928e3b8d1ab9cba551_163415_101.jpg","title":"《你的名字。》首发预告","roomId":""},{"airTime":0,"duration":"00:01:17","loadtype":"video","score":0,"angleIcon":"","dataId":"8ceefd1b166142e5b6e6af7c983f8889","description":"@TV新片速递：巨制《神奇动物在哪里》,将于11月25日登陆内地银幕。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=8ceefd1b166142e5b6e6af7c983f8889","shareURL":"http://m.svipmovie.com/#/moviedetails/8ceefd1b166142e5b6e6af7c983f8889","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/1117/8ceefd1b166142e5b6e6af7c983f8889_162555_101.jpg","title":"《神奇动物在哪里》预告","roomId":""},{"airTime":0,"duration":"00:02:30","loadtype":"video","score":0,"angleIcon":"","dataId":"ed6f3622af5a494abbe875bb434130e4","description":"@TV新片速递：由张艺谋执导的《长城》将于12月16日全国公映。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=ed6f3622af5a494abbe875bb434130e4","shareURL":"http://m.svipmovie.com/#/moviedetails/ed6f3622af5a494abbe875bb434130e4","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/1114/ed6f3622af5a494abbe875bb434130e4_161687_101.jpg","title":"《长城》预告片","roomId":""},{"airTime":0,"duration":"00:02:38","loadtype":"video","score":0,"angleIcon":"","dataId":"a9de4b97055f4693b10e5d38547b4953","description":"@TV新片速递：2016年11月8日，《佩小姐的奇幻城堡》发布会直播。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=a9de4b97055f4693b10e5d38547b4953","shareURL":"http://m.svipmovie.com/#/moviedetails/a9de4b97055f4693b10e5d38547b4953","pic":"http://y1.cnliveimg.com:8080/image/itv/2016/1107/a9de4b97055f4693b10e5d38547b4953_159670_101.jpg","title":"《佩小姐的奇幻城堡》长预告","roomId":""},{"airTime":0,"duration":"00:01:30","loadtype":"video","score":0,"angleIcon":"","dataId":"35dba2aa43a040e4ae526829991f2f26","description":"@TV新片速递：《一句顶一万句》预告片。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=35dba2aa43a040e4ae526829991f2f26","shareURL":"http://m.svipmovie.com/#/moviedetails/35dba2aa43a040e4ae526829991f2f26","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/1031/35dba2aa43a040e4ae526829991f2f26_158198_101.jpg","title":"一句顶一万句预告片","roomId":""},{"airTime":0,"duration":"00:08:44","loadtype":"video","score":0,"angleIcon":"","dataId":"9b6aae349e2d46838f96469cf75ee62b","description":"@TV新片速递：华语电影深圳盛典暨\u201c第四届十大华语电影\u201d表彰典礼。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=9b6aae349e2d46838f96469cf75ee62b","shareURL":"http://m.svipmovie.com/#/moviedetails/9b6aae349e2d46838f96469cf75ee62b","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/1027/9b6aae349e2d46838f96469cf75ee62b_157553_101.jpg","title":"第四届\u201c十大华语电影\u201d颁奖典礼预告","roomId":""},{"airTime":0,"duration":"00:01:52","loadtype":"video","score":0,"angleIcon":"","dataId":"3da1f2eab90040ffbc10c551d120ae61","description":"@TV新片速递：漫威力作《奇异博士》来袭，本尼演绎史上最强魔法师。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3da1f2eab90040ffbc10c551d120ae61","shareURL":"http://m.svipmovie.com/#/moviedetails/3da1f2eab90040ffbc10c551d120ae61","pic":"http://y1.cnliveimg.com:8080/image/itv/2016/1015/3da1f2eab90040ffbc10c551d120ae61_154631_101.jpg","title":"《奇异博士》中文预告","roomId":""},{"airTime":0,"duration":"00:02:10","loadtype":"video","score":0,"angleIcon":"","dataId":"89e3f4fe6d454f8b90b0ccff8b4876d6","description":"@TV新片速递：第七届全球华语科幻星云奖颁奖典礼，科幻大咖集结。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=89e3f4fe6d454f8b90b0ccff8b4876d6","shareURL":"http://m.svipmovie.com/#/moviedetails/89e3f4fe6d454f8b90b0ccff8b4876d6","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/0907/89e3f4fe6d454f8b90b0ccff8b4876d6_147470_101.jpg","title":"第七届全球华语科幻星云奖","roomId":""},{"airTime":0,"duration":"00:00:14","loadtype":"video","score":0,"angleIcon":"","dataId":"f12633987aff4ff1beaf43b1cf90f398","description":"@TV新片速递：《谍影重重5》备受期待，马特·达蒙强势回归。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=f12633987aff4ff1beaf43b1cf90f398","shareURL":"http://m.svipmovie.com/#/moviedetails/f12633987aff4ff1beaf43b1cf90f398","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/0811/f12633987aff4ff1beaf43b1cf90f398_141804_101.jpg","title":"《谍影重重5》强势回归","roomId":""},{"airTime":0,"duration":"00:06:19","loadtype":"video","score":0,"angleIcon":"","dataId":"354cced41aba4427a02ed7ec74984482","description":"@TV新片速递：《盗墓笔记》超级IP，井柏然、鹿晗实力还原张起灵、吴邪。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=354cced41aba4427a02ed7ec74984482","shareURL":"http://m.svipmovie.com/#/moviedetails/354cced41aba4427a02ed7ec74984482","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/0729/354cced41aba4427a02ed7ec74984482_139155_101.jpg","title":"《盗墓笔记》终极预告","roomId":""},{"airTime":0,"duration":"00:01:00","loadtype":"video","score":0,"angleIcon":"","dataId":"47946a3bc33f41db9f5999e02dc4e936","description":"@TV新片速递：《泰山归来：险战丛林》备受关注，真人3D动作冒险巨制。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=47946a3bc33f41db9f5999e02dc4e936","shareURL":"http://m.svipmovie.com/#/moviedetails/47946a3bc33f41db9f5999e02dc4e936","pic":"","title":"《泰山归来》终极预告","roomId":""},{"airTime":0,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"92eb41a2a3d2442a93717456dcf9655a","description":"@TV新片速递：《致青春·原来你还在这里》备受期待，吴亦凡、刘亦菲主演青春爱情电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=92eb41a2a3d2442a93717456dcf9655a","shareURL":"http://m.svipmovie.com/#/moviedetails/92eb41a2a3d2442a93717456dcf9655a","pic":"","title":"《原来你还在这里》甜蜜预告","roomId":""},{"airTime":0,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"1bdc9a132a00425680034486d9d32a48","description":"@TV新片速递：《致青春·原来你还在这里》备受期待，吴亦凡、刘亦菲主演青春爱情电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=1bdc9a132a00425680034486d9d32a48","shareURL":"http://m.svipmovie.com/#/moviedetails/1bdc9a132a00425680034486d9d32a48","pic":"","title":"《原来你还在这里》甜版预告","roomId":""},{"airTime":0,"duration":"00:01:36","loadtype":"video","score":0,"angleIcon":"","dataId":"5ebacfa42cb24591b151f662429135a6","description":"@TV新片速递：《赏金猎人》广受好评，中韩合拍动作喜剧电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=5ebacfa42cb24591b151f662429135a6","shareURL":"http://m.svipmovie.com/#/moviedetails/5ebacfa42cb24591b151f662429135a6","pic":"http://yweb2.cnliveimg.com/cnlive/public/160622163637671_861.jpg","title":"《赏金猎人》终极预告","roomId":""},{"airTime":0,"duration":"00:02:24","loadtype":"video","score":0,"angleIcon":"","dataId":"c2dd382012144f4d88531b00b59373d1","description":"@TV新片速递：《X战警：天启》广受好评，最酷的超级英雄电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=c2dd382012144f4d88531b00b59373d1","shareURL":"http://m.svipmovie.com/#/moviedetails/c2dd382012144f4d88531b00b59373d1","pic":"","title":"《X战警：天启》长预告","roomId":""},{"airTime":0,"duration":"00:01:25","loadtype":"video","score":0,"angleIcon":"","dataId":"416c1e7990ce497d8e8b13df4891c88c","description":"@TV新片速递：《再见，在也不见》发终极海报，陈柏霖蒋雯丽激吻。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=416c1e7990ce497d8e8b13df4891c88c","shareURL":"http://m.svipmovie.com/#/moviedetails/416c1e7990ce497d8e8b13df4891c88c","pic":"","title":"《再见在也不见》特辑","roomId":""},{"airTime":2014,"duration":"00:03:31","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618442772","description":"父爱如山，小时候爸爸骑自行车为女儿送作业，长大了，时间尘封了父母的爱，工作后爸爸骑自行车为女儿送文件。那一刻，父爱从未走远。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618442772","shareURL":"","pic":"http://yweb0.cnliveimg.com/img/CMCC_MOVIE/618442772_699022_HSJ1080V.jpg","title":"爱爸爸很简单","roomId":""},{"airTime":2014,"duration":"00:10:37","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618429277","description":"离婚后的颓废生活。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618429277","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618429277_699022_HSJ1080V.jpg","title":"都市荒原","roomId":""},{"airTime":2014,"duration":"00:09:26","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240437","description":"打算拍电影时资金链却断裂了，这时一个女孩找到了他们，这个女孩为了参加一个真人秀节目要拍一部真实生活的VCR\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240437","shareURL":"","pic":"http://yweb0.cnliveimg.com/img/CMCC_MOVIE/618240437_699022_HSJ1080V.jpg","title":"欲望迷情","roomId":""},{"airTime":2014,"duration":"00:03:16","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618239246","description":"《萱萼Daylily》金丹若国际微电影艺术节参赛影片浪漫唯美感人微电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618239246","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618239246_699022_HSJ1080V.jpg","title":"萱萼Daylily","roomId":""},{"airTime":2014,"duration":"00:04:03","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618239215","description":"老马夫妻平时节衣缩食想供小马去一个好学校，但苦于没钱没关系，马妻参加同学聚会望能为小马解决上学问题，不料意外却发生\u2026\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618239215","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618239215_699022_HSJ1080V.jpg","title":"老马","roomId":""},{"airTime":2014,"duration":"00:07:19","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240321","description":"微电影《钻石大劫案》是由圆梦家、著名电影制片人、王吉银先生的公司巨沅梦集团出品。导演王海江以幽默搞笑的故事题材博得观众的眼球，主要讲诉超级美女三姐妹是如何盗取假的钻石项链\u2014\u2014海洋之星，并引发了一系列的搞笑场面。而且让人们反思，人世间最珍贵的不是钻石，而是\u2026\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240321","shareURL":"","pic":"http://yweb1.cnliveimg.com/img/CMCC_MOVIE/618240321_699022_HSJ1080V.jpg","title":"钻石大劫案","roomId":""},{"airTime":2014,"duration":"00:11:39","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240561","description":"大学里的爱情故事。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240561","shareURL":"","pic":"http://yweb3.cnliveimg.com/img/CMCC_MOVIE/618240561_699022_HSJ1080V.jpg","title":"爱不单行","roomId":""},{"airTime":2014,"duration":"00:11:45","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240452","description":"毕业将至，男孩意识到自己该珍惜眼前人的时候，女孩却从他生活中消失。那个一起笑一起闹一起嘻嘻哈哈的哥们总是想要告白，可是我爱你这三个字始终说不出口，当女孩真的要走的了时候他才意思到要是错过了就是一辈子都错过了，所以他鼓足了勇气向女孩表白，两人有情人终成眷属。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240452","shareURL":"","pic":"http://yweb1.cnliveimg.com/img/CMCC_MOVIE/618240452_699022_HSJ1080V.jpg","title":"爱的速递","roomId":""},{"airTime":2014,"duration":"00:07:41","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618239151","description":"一个人写剧本时所发生的故事，到底发生了什么呢\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618239151","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618239151_699022_HSJ1080V.jpg","title":"无法触碰","roomId":""},{"airTime":2016,"duration":"00:00:56","loadtype":"video","score":0,"angleIcon":"","dataId":"eea34864c2ae4c22a18f61784a634a99","description":"@TV新片速递：《青蛙总动员》终极预告，青蛙家族踏上冒险之旅。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=eea34864c2ae4c22a18f61784a634a99","shareURL":"http://m.svipmovie.com/#/moviedetails/eea34864c2ae4c22a18f61784a634a99","pic":"","title":"《青蛙总动员》预告","roomId":""}],"totalPnum":9}
     * code : 200
     */

    private String msg;
    private RetBean ret;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RetBean getRet() {
        return ret;
    }

    public void setRet(RetBean ret) {
        this.ret = ret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class RetBean {
        /**
         * adv : {"imgURL":"","dataId":"","htmlURL":"","shareURL":"","title":""}
         * pnum : 8
         * totalRecords : 30
         * bannerList : []
         * records : 30
         * list : [{"airTime":2016,"duration":"00:01:33","loadtype":"video","score":0,"angleIcon":"","dataId":"c9d1eab1cb2d4ce2acf2bf6871cd3a84","description":"@TV新片速递：今日片方发布了\u201c狂欢\u201d版预告和海报。区别于传统严肃的硬汉形象，海报中头大身子小的飞虎队十分\u201c萌萌哒\u201d，他们表情夸张，与火车一起冲出五彩浓烟，极富喜感。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=c9d1eab1cb2d4ce2acf2bf6871cd3a84","shareURL":"http://m.svipmovie.com/#/moviedetails/c9d1eab1cb2d4ce2acf2bf6871cd3a84","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2016/12/12/1481537020044097544.jpg","title":"《铁道飞虎》狂欢版预告","roomId":""},{"airTime":2016,"duration":"00:02:48","loadtype":"video","score":0,"angleIcon":"","dataId":"c38c2bc84261425b9a1fa5be40c991f4","description":"@TV新片速递：由飞虎队合体演唱的主题曲《弹起我心爱的土琵琶》，MV中，黄子韬起头演唱\u201c西边的太阳就要落山了\u201d总是找不到调，被成龙嫌弃道：\u201c他在片场天天唱，烦死了。\u201d","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=c38c2bc84261425b9a1fa5be40c991f4","shareURL":"http://m.svipmovie.com/#/moviedetails/c38c2bc84261425b9a1fa5be40c991f4","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2016/12/10/1481339960058068889.jpg","title":"《铁道飞虎》主题曲","roomId":""},{"airTime":0,"duration":"00:00:52","loadtype":"video","score":0,"angleIcon":"","dataId":"81fd080cd2ab43288229873ab121a690","description":"@TV新片速递：《铁道飞虎》是由丁晟执导，成龙、黄子韬、王凯、王大陆等主演的动作、战争题材喜剧电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=81fd080cd2ab43288229873ab121a690","shareURL":"http://m.svipmovie.com/#/moviedetails/81fd080cd2ab43288229873ab121a690","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/1207/81fd080cd2ab43288229873ab121a690_168028_101.jpg","title":"铁道飞虎定档预告片","roomId":""},{"airTime":0,"duration":"00:01:02","loadtype":"video","score":0,"angleIcon":"","dataId":"6b87cb52a77d4b66aa47742f12c53d8f","description":"@TV新片速递：由姜武监制，梁栋执导，姜武、蒋勤勤领衔主演、李乃文、傅颖主演的奇幻穿越电影《完美有多美》发布\u201c奇幻人生\u201d先导预告。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=6b87cb52a77d4b66aa47742f12c53d8f","shareURL":"http://m.svipmovie.com/#/moviedetails/6b87cb52a77d4b66aa47742f12c53d8f","pic":"http://y1.cnliveimg.com:8080/image/itv/2016/1127/6b87cb52a77d4b66aa47742f12c53d8f_165267_101.jpg","title":"《完美有多美》预告片","roomId":""},{"airTime":0,"duration":"00:01:50","loadtype":"video","score":0,"angleIcon":"","dataId":"cb585132596f4a928e3b8d1ab9cba551","description":"@TV新片速递：2016年11月21日19:00，《你的名字。》红毯直播。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=cb585132596f4a928e3b8d1ab9cba551","shareURL":"http://m.svipmovie.com/#/moviedetails/cb585132596f4a928e3b8d1ab9cba551","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/1121/cb585132596f4a928e3b8d1ab9cba551_163415_101.jpg","title":"《你的名字。》首发预告","roomId":""},{"airTime":0,"duration":"00:01:17","loadtype":"video","score":0,"angleIcon":"","dataId":"8ceefd1b166142e5b6e6af7c983f8889","description":"@TV新片速递：巨制《神奇动物在哪里》,将于11月25日登陆内地银幕。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=8ceefd1b166142e5b6e6af7c983f8889","shareURL":"http://m.svipmovie.com/#/moviedetails/8ceefd1b166142e5b6e6af7c983f8889","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/1117/8ceefd1b166142e5b6e6af7c983f8889_162555_101.jpg","title":"《神奇动物在哪里》预告","roomId":""},{"airTime":0,"duration":"00:02:30","loadtype":"video","score":0,"angleIcon":"","dataId":"ed6f3622af5a494abbe875bb434130e4","description":"@TV新片速递：由张艺谋执导的《长城》将于12月16日全国公映。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=ed6f3622af5a494abbe875bb434130e4","shareURL":"http://m.svipmovie.com/#/moviedetails/ed6f3622af5a494abbe875bb434130e4","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/1114/ed6f3622af5a494abbe875bb434130e4_161687_101.jpg","title":"《长城》预告片","roomId":""},{"airTime":0,"duration":"00:02:38","loadtype":"video","score":0,"angleIcon":"","dataId":"a9de4b97055f4693b10e5d38547b4953","description":"@TV新片速递：2016年11月8日，《佩小姐的奇幻城堡》发布会直播。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=a9de4b97055f4693b10e5d38547b4953","shareURL":"http://m.svipmovie.com/#/moviedetails/a9de4b97055f4693b10e5d38547b4953","pic":"http://y1.cnliveimg.com:8080/image/itv/2016/1107/a9de4b97055f4693b10e5d38547b4953_159670_101.jpg","title":"《佩小姐的奇幻城堡》长预告","roomId":""},{"airTime":0,"duration":"00:01:30","loadtype":"video","score":0,"angleIcon":"","dataId":"35dba2aa43a040e4ae526829991f2f26","description":"@TV新片速递：《一句顶一万句》预告片。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=35dba2aa43a040e4ae526829991f2f26","shareURL":"http://m.svipmovie.com/#/moviedetails/35dba2aa43a040e4ae526829991f2f26","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/1031/35dba2aa43a040e4ae526829991f2f26_158198_101.jpg","title":"一句顶一万句预告片","roomId":""},{"airTime":0,"duration":"00:08:44","loadtype":"video","score":0,"angleIcon":"","dataId":"9b6aae349e2d46838f96469cf75ee62b","description":"@TV新片速递：华语电影深圳盛典暨\u201c第四届十大华语电影\u201d表彰典礼。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=9b6aae349e2d46838f96469cf75ee62b","shareURL":"http://m.svipmovie.com/#/moviedetails/9b6aae349e2d46838f96469cf75ee62b","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/1027/9b6aae349e2d46838f96469cf75ee62b_157553_101.jpg","title":"第四届\u201c十大华语电影\u201d颁奖典礼预告","roomId":""},{"airTime":0,"duration":"00:01:52","loadtype":"video","score":0,"angleIcon":"","dataId":"3da1f2eab90040ffbc10c551d120ae61","description":"@TV新片速递：漫威力作《奇异博士》来袭，本尼演绎史上最强魔法师。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3da1f2eab90040ffbc10c551d120ae61","shareURL":"http://m.svipmovie.com/#/moviedetails/3da1f2eab90040ffbc10c551d120ae61","pic":"http://y1.cnliveimg.com:8080/image/itv/2016/1015/3da1f2eab90040ffbc10c551d120ae61_154631_101.jpg","title":"《奇异博士》中文预告","roomId":""},{"airTime":0,"duration":"00:02:10","loadtype":"video","score":0,"angleIcon":"","dataId":"89e3f4fe6d454f8b90b0ccff8b4876d6","description":"@TV新片速递：第七届全球华语科幻星云奖颁奖典礼，科幻大咖集结。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=89e3f4fe6d454f8b90b0ccff8b4876d6","shareURL":"http://m.svipmovie.com/#/moviedetails/89e3f4fe6d454f8b90b0ccff8b4876d6","pic":"http://y3.cnliveimg.com:8080/image/itv/2016/0907/89e3f4fe6d454f8b90b0ccff8b4876d6_147470_101.jpg","title":"第七届全球华语科幻星云奖","roomId":""},{"airTime":0,"duration":"00:00:14","loadtype":"video","score":0,"angleIcon":"","dataId":"f12633987aff4ff1beaf43b1cf90f398","description":"@TV新片速递：《谍影重重5》备受期待，马特·达蒙强势回归。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=f12633987aff4ff1beaf43b1cf90f398","shareURL":"http://m.svipmovie.com/#/moviedetails/f12633987aff4ff1beaf43b1cf90f398","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/0811/f12633987aff4ff1beaf43b1cf90f398_141804_101.jpg","title":"《谍影重重5》强势回归","roomId":""},{"airTime":0,"duration":"00:06:19","loadtype":"video","score":0,"angleIcon":"","dataId":"354cced41aba4427a02ed7ec74984482","description":"@TV新片速递：《盗墓笔记》超级IP，井柏然、鹿晗实力还原张起灵、吴邪。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=354cced41aba4427a02ed7ec74984482","shareURL":"http://m.svipmovie.com/#/moviedetails/354cced41aba4427a02ed7ec74984482","pic":"http://y2.cnliveimg.com:8080/image/itv/2016/0729/354cced41aba4427a02ed7ec74984482_139155_101.jpg","title":"《盗墓笔记》终极预告","roomId":""},{"airTime":0,"duration":"00:01:00","loadtype":"video","score":0,"angleIcon":"","dataId":"47946a3bc33f41db9f5999e02dc4e936","description":"@TV新片速递：《泰山归来：险战丛林》备受关注，真人3D动作冒险巨制。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=47946a3bc33f41db9f5999e02dc4e936","shareURL":"http://m.svipmovie.com/#/moviedetails/47946a3bc33f41db9f5999e02dc4e936","pic":"","title":"《泰山归来》终极预告","roomId":""},{"airTime":0,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"92eb41a2a3d2442a93717456dcf9655a","description":"@TV新片速递：《致青春·原来你还在这里》备受期待，吴亦凡、刘亦菲主演青春爱情电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=92eb41a2a3d2442a93717456dcf9655a","shareURL":"http://m.svipmovie.com/#/moviedetails/92eb41a2a3d2442a93717456dcf9655a","pic":"","title":"《原来你还在这里》甜蜜预告","roomId":""},{"airTime":0,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"1bdc9a132a00425680034486d9d32a48","description":"@TV新片速递：《致青春·原来你还在这里》备受期待，吴亦凡、刘亦菲主演青春爱情电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=1bdc9a132a00425680034486d9d32a48","shareURL":"http://m.svipmovie.com/#/moviedetails/1bdc9a132a00425680034486d9d32a48","pic":"","title":"《原来你还在这里》甜版预告","roomId":""},{"airTime":0,"duration":"00:01:36","loadtype":"video","score":0,"angleIcon":"","dataId":"5ebacfa42cb24591b151f662429135a6","description":"@TV新片速递：《赏金猎人》广受好评，中韩合拍动作喜剧电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=5ebacfa42cb24591b151f662429135a6","shareURL":"http://m.svipmovie.com/#/moviedetails/5ebacfa42cb24591b151f662429135a6","pic":"http://yweb2.cnliveimg.com/cnlive/public/160622163637671_861.jpg","title":"《赏金猎人》终极预告","roomId":""},{"airTime":0,"duration":"00:02:24","loadtype":"video","score":0,"angleIcon":"","dataId":"c2dd382012144f4d88531b00b59373d1","description":"@TV新片速递：《X战警：天启》广受好评，最酷的超级英雄电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=c2dd382012144f4d88531b00b59373d1","shareURL":"http://m.svipmovie.com/#/moviedetails/c2dd382012144f4d88531b00b59373d1","pic":"","title":"《X战警：天启》长预告","roomId":""},{"airTime":0,"duration":"00:01:25","loadtype":"video","score":0,"angleIcon":"","dataId":"416c1e7990ce497d8e8b13df4891c88c","description":"@TV新片速递：《再见，在也不见》发终极海报，陈柏霖蒋雯丽激吻。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=416c1e7990ce497d8e8b13df4891c88c","shareURL":"http://m.svipmovie.com/#/moviedetails/416c1e7990ce497d8e8b13df4891c88c","pic":"","title":"《再见在也不见》特辑","roomId":""},{"airTime":2014,"duration":"00:03:31","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618442772","description":"父爱如山，小时候爸爸骑自行车为女儿送作业，长大了，时间尘封了父母的爱，工作后爸爸骑自行车为女儿送文件。那一刻，父爱从未走远。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618442772","shareURL":"","pic":"http://yweb0.cnliveimg.com/img/CMCC_MOVIE/618442772_699022_HSJ1080V.jpg","title":"爱爸爸很简单","roomId":""},{"airTime":2014,"duration":"00:10:37","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618429277","description":"离婚后的颓废生活。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618429277","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618429277_699022_HSJ1080V.jpg","title":"都市荒原","roomId":""},{"airTime":2014,"duration":"00:09:26","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240437","description":"打算拍电影时资金链却断裂了，这时一个女孩找到了他们，这个女孩为了参加一个真人秀节目要拍一部真实生活的VCR\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240437","shareURL":"","pic":"http://yweb0.cnliveimg.com/img/CMCC_MOVIE/618240437_699022_HSJ1080V.jpg","title":"欲望迷情","roomId":""},{"airTime":2014,"duration":"00:03:16","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618239246","description":"《萱萼Daylily》金丹若国际微电影艺术节参赛影片浪漫唯美感人微电影。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618239246","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618239246_699022_HSJ1080V.jpg","title":"萱萼Daylily","roomId":""},{"airTime":2014,"duration":"00:04:03","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618239215","description":"老马夫妻平时节衣缩食想供小马去一个好学校，但苦于没钱没关系，马妻参加同学聚会望能为小马解决上学问题，不料意外却发生\u2026\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618239215","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618239215_699022_HSJ1080V.jpg","title":"老马","roomId":""},{"airTime":2014,"duration":"00:07:19","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240321","description":"微电影《钻石大劫案》是由圆梦家、著名电影制片人、王吉银先生的公司巨沅梦集团出品。导演王海江以幽默搞笑的故事题材博得观众的眼球，主要讲诉超级美女三姐妹是如何盗取假的钻石项链\u2014\u2014海洋之星，并引发了一系列的搞笑场面。而且让人们反思，人世间最珍贵的不是钻石，而是\u2026\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240321","shareURL":"","pic":"http://yweb1.cnliveimg.com/img/CMCC_MOVIE/618240321_699022_HSJ1080V.jpg","title":"钻石大劫案","roomId":""},{"airTime":2014,"duration":"00:11:39","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240561","description":"大学里的爱情故事。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240561","shareURL":"","pic":"http://yweb3.cnliveimg.com/img/CMCC_MOVIE/618240561_699022_HSJ1080V.jpg","title":"爱不单行","roomId":""},{"airTime":2014,"duration":"00:11:45","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618240452","description":"毕业将至，男孩意识到自己该珍惜眼前人的时候，女孩却从他生活中消失。那个一起笑一起闹一起嘻嘻哈哈的哥们总是想要告白，可是我爱你这三个字始终说不出口，当女孩真的要走的了时候他才意思到要是错过了就是一辈子都错过了，所以他鼓足了勇气向女孩表白，两人有情人终成眷属。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618240452","shareURL":"","pic":"http://yweb1.cnliveimg.com/img/CMCC_MOVIE/618240452_699022_HSJ1080V.jpg","title":"爱的速递","roomId":""},{"airTime":2014,"duration":"00:07:41","loadtype":"video","score":0,"angleIcon":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/05/09/1494296586400001011.png","dataId":"CMCC_00000000000000001_618239151","description":"一个人写剧本时所发生的故事，到底发生了什么呢\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_618239151","shareURL":"","pic":"http://yweb2.cnliveimg.com/img/CMCC_MOVIE/618239151_699022_HSJ1080V.jpg","title":"无法触碰","roomId":""},{"airTime":2016,"duration":"00:00:56","loadtype":"video","score":0,"angleIcon":"","dataId":"eea34864c2ae4c22a18f61784a634a99","description":"@TV新片速递：《青蛙总动员》终极预告，青蛙家族踏上冒险之旅。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=eea34864c2ae4c22a18f61784a634a99","shareURL":"http://m.svipmovie.com/#/moviedetails/eea34864c2ae4c22a18f61784a634a99","pic":"","title":"《青蛙总动员》预告","roomId":""}]
         * totalPnum : 9
         */

        private AdvBean adv;
        private int pnum;
        private int totalRecords;
        private int records;
        private int totalPnum;
        private List<?> bannerList;
        private List<ListBean> list;

        public AdvBean getAdv() {
            return adv;
        }

        public void setAdv(AdvBean adv) {
            this.adv = adv;
        }

        public int getPnum() {
            return pnum;
        }

        public void setPnum(int pnum) {
            this.pnum = pnum;
        }

        public int getTotalRecords() {
            return totalRecords;
        }

        public void setTotalRecords(int totalRecords) {
            this.totalRecords = totalRecords;
        }

        public int getRecords() {
            return records;
        }

        public void setRecords(int records) {
            this.records = records;
        }

        public int getTotalPnum() {
            return totalPnum;
        }

        public void setTotalPnum(int totalPnum) {
            this.totalPnum = totalPnum;
        }

        public List<?> getBannerList() {
            return bannerList;
        }

        public void setBannerList(List<?> bannerList) {
            this.bannerList = bannerList;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class AdvBean {
            /**
             * imgURL :
             * dataId :
             * htmlURL :
             * shareURL :
             * title :
             */

            private String imgURL;
            private String dataId;
            private String htmlURL;
            private String shareURL;
            private String title;

            public String getImgURL() {
                return imgURL;
            }

            public void setImgURL(String imgURL) {
                this.imgURL = imgURL;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getHtmlURL() {
                return htmlURL;
            }

            public void setHtmlURL(String htmlURL) {
                this.htmlURL = htmlURL;
            }

            public String getShareURL() {
                return shareURL;
            }

            public void setShareURL(String shareURL) {
                this.shareURL = shareURL;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class ListBean {
            /**
             * airTime : 2016
             * duration : 00:01:33
             * loadtype : video
             * score : 0
             * angleIcon :
             * dataId : c9d1eab1cb2d4ce2acf2bf6871cd3a84
             * description : @TV新片速递：今日片方发布了“狂欢”版预告和海报。区别于传统严肃的硬汉形象，海报中头大身子小的飞虎队十分“萌萌哒”，他们表情夸张，与火车一起冲出五彩浓烟，极富喜感。
             * loadURL : http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=c9d1eab1cb2d4ce2acf2bf6871cd3a84
             * shareURL : http://m.svipmovie.com/#/moviedetails/c9d1eab1cb2d4ce2acf2bf6871cd3a84
             * pic : http://phonemovie.ks3-cn-beijing.ksyun.com/image/2016/12/12/1481537020044097544.jpg
             * title : 《铁道飞虎》狂欢版预告
             * roomId :
             */

            private int airTime;
            private String duration;
            private String loadtype;
            private int score;
            private String angleIcon;
            private String dataId;
            private String description;
            private String loadURL;
            private String shareURL;
            private String pic;
            private String title;
            private String roomId;

            public int getAirTime() {
                return airTime;
            }

            public void setAirTime(int airTime) {
                this.airTime = airTime;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getLoadtype() {
                return loadtype;
            }

            public void setLoadtype(String loadtype) {
                this.loadtype = loadtype;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getAngleIcon() {
                return angleIcon;
            }

            public void setAngleIcon(String angleIcon) {
                this.angleIcon = angleIcon;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getLoadURL() {
                return loadURL;
            }

            public void setLoadURL(String loadURL) {
                this.loadURL = loadURL;
            }

            public String getShareURL() {
                return shareURL;
            }

            public void setShareURL(String shareURL) {
                this.shareURL = shareURL;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getRoomId() {
                return roomId;
            }

            public void setRoomId(String roomId) {
                this.roomId = roomId;
            }
        }
    }
}
