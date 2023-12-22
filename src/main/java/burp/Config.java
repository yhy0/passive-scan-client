package burp;

public class Config {
    public static boolean IS_RUNNING = false;

    public static boolean PROXY = true;
    public static boolean REPEATER = false;
    public static boolean INTRUDER = false;
    public static String PROXY_HOST = "127.0.0.1";
    public static Integer PROXY_PORT = 8080;
    public static String PROXY_USERNAME = "";
    public static String PROXY_PASSWORD = "";

    public static String PROXY_BASIC_HEADER = "Proxy-Authorization";
    public static Integer PROXY_TIMEOUT = 5000;
    public static String DOMAIN_REGX = "";
    public static String SUFFIX_REGX = "gif|png|bmp|js|css|jpeg|gif|jpg|png|pdf|rar|zip|docx|doc|svg|ico|woff|woff2|ttf|otf|jpeg|jpg|mp3|wma|flv|mp4|wmv|ogg|avi|doc|docx|xls|xlsx|ppt|pptx|txt|pdf|zip|exe|tat|ico|css|js|swf|apk|m3u8|ts|ejs|svg|woff|otf";


    // 响应体和响应头匹配字符串, 则跳过
    public static String BLACKLIST_RESP = "拦截|X-Powered-By-360wzb|X-dotDefender-denied";

   // 新增关键字、域名黑名单
    public static String BLACKLIST_REGX = "google.com|baidu.com|mozilla.org|mozilla.com|googleapis.com|delete|remove";

    public static Integer REQUEST_TOTAL = 0;
    public static Integer SUCCESS_TOTAL = 0;
    public static Integer FAIL_TOTAL = 0;
    
    public static Integer INTERVAL_TIME = 100;
}
