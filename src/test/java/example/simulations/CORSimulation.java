package example.simulations;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class CORSimulation extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://www.facebook.com")
      .inferHtmlResources(AllowList(), DenyList())
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_0.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("Origin", "https://cor-staging-1.xyz");
    headers_2.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_2.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_10.put("accept-encoding", "gzip, deflate, br");
    headers_10.put("accept-language", "es-419,es;q=0.9");
    headers_10.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_10.put("sec-ch-ua-mobile", "?0");
    headers_10.put("sec-ch-ua-platform", "macOS");
    headers_10.put("sec-fetch-dest", "document");
    headers_10.put("sec-fetch-mode", "navigate");
    headers_10.put("sec-fetch-site", "same-site");
    headers_10.put("sec-fetch-user", "?1");
    headers_10.put("upgrade-insecure-requests", "1");
    headers_10.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_14 = new HashMap<>();
    headers_14.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_14.put("accept-encoding", "gzip, deflate, br");
    headers_14.put("accept-language", "es-419,es;q=0.9");
    headers_14.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_14.put("sec-ch-ua-mobile", "?0");
    headers_14.put("sec-ch-ua-platform", "macOS");
    headers_14.put("sec-fetch-dest", "image");
    headers_14.put("sec-fetch-mode", "no-cors");
    headers_14.put("sec-fetch-site", "cross-site");
    headers_14.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_21 = new HashMap<>();
    headers_21.put("accept", "*/*");
    headers_21.put("accept-encoding", "gzip, deflate, br");
    headers_21.put("accept-language", "es-419,es;q=0.9");
    headers_21.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_21.put("sec-ch-ua-mobile", "?0");
    headers_21.put("sec-ch-ua-platform", "macOS");
    headers_21.put("sec-fetch-dest", "script");
    headers_21.put("sec-fetch-mode", "no-cors");
    headers_21.put("sec-fetch-site", "cross-site");
    headers_21.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_25 = new HashMap<>();
    headers_25.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_25.put("accept-encoding", "gzip, deflate, br");
    headers_25.put("accept-language", "es-419,es;q=0.9");
    headers_25.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_25.put("sec-ch-ua-mobile", "?0");
    headers_25.put("sec-ch-ua-platform", "macOS");
    headers_25.put("sec-fetch-dest", "image");
    headers_25.put("sec-fetch-mode", "no-cors");
    headers_25.put("sec-fetch-site", "same-origin");
    headers_25.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_33 = new HashMap<>();
    headers_33.put("accept", "*/*");
    headers_33.put("accept-encoding", "gzip, deflate, br");
    headers_33.put("accept-language", "es-419,es;q=0.9");
    headers_33.put("access-control-request-headers", "x-hubspot-messages-uri");
    headers_33.put("access-control-request-method", "GET");
    headers_33.put("origin", "https://cor-staging-1.xyz");
    headers_33.put("sec-fetch-dest", "empty");
    headers_33.put("sec-fetch-mode", "cors");
    headers_33.put("sec-fetch-site", "cross-site");
    headers_33.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_35 = new HashMap<>();
    headers_35.put("accept", "*/*");
    headers_35.put("accept-encoding", "gzip, deflate, br");
    headers_35.put("accept-language", "es-419,es;q=0.9");
    headers_35.put("origin", "https://cor-staging-1.xyz");
    headers_35.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_35.put("sec-ch-ua-mobile", "?0");
    headers_35.put("sec-ch-ua-platform", "macOS");
    headers_35.put("sec-fetch-dest", "empty");
    headers_35.put("sec-fetch-mode", "cors");
    headers_35.put("sec-fetch-site", "cross-site");
    headers_35.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_40 = new HashMap<>();
    headers_40.put("Accept", "*/*");
    headers_40.put("Accept-Encoding", "gzip, deflate, br");
    headers_40.put("Accept-Language", "es-419,es;q=0.9");
    headers_40.put("Sec-Fetch-Dest", "script");
    headers_40.put("Sec-Fetch-Mode", "no-cors");
    headers_40.put("Sec-Fetch-Site", "cross-site");
    headers_40.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_40.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_40.put("sec-ch-ua-mobile", "?0");
    headers_40.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_41 = new HashMap<>();
    headers_41.put("accept", "*/*");
    headers_41.put("accept-encoding", "gzip, deflate, br");
    headers_41.put("accept-language", "es-419,es;q=0.9");
    headers_41.put("origin", "https://cor-staging-1.xyz");
    headers_41.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_41.put("sec-ch-ua-mobile", "?0");
    headers_41.put("sec-ch-ua-platform", "macOS");
    headers_41.put("sec-fetch-dest", "empty");
    headers_41.put("sec-fetch-mode", "cors");
    headers_41.put("sec-fetch-site", "cross-site");
    headers_41.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_41.put("x-hubspot-messages-uri", "https://cor-staging-1.xyz/login");
    
    Map<CharSequence, String> headers_49 = new HashMap<>();
    headers_49.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_49.put("accept-encoding", "gzip, deflate, br");
    headers_49.put("accept-language", "es-419,es;q=0.9");
    headers_49.put("origin", "https://cor-staging-1.xyz");
    headers_49.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_49.put("sec-ch-ua-mobile", "?0");
    headers_49.put("sec-ch-ua-platform", "macOS");
    headers_49.put("sec-fetch-dest", "document");
    headers_49.put("sec-fetch-mode", "navigate");
    headers_49.put("sec-fetch-site", "same-origin");
    headers_49.put("sec-fetch-user", "?1");
    headers_49.put("upgrade-insecure-requests", "1");
    headers_49.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_59 = new HashMap<>();
    headers_59.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_59.put("accept-encoding", "gzip, deflate, br");
    headers_59.put("accept-language", "es-419,es;q=0.9");
    headers_59.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_59.put("sec-ch-ua-mobile", "?0");
    headers_59.put("sec-ch-ua-platform", "macOS");
    headers_59.put("sec-fetch-dest", "empty");
    headers_59.put("sec-fetch-mode", "no-cors");
    headers_59.put("sec-fetch-site", "cross-site");
    headers_59.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_63 = new HashMap<>();
    headers_63.put("Origin", "https://demo-sp.cor-staging-1.xyz");
    headers_63.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_63.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_63.put("sec-ch-ua-mobile", "?0");
    headers_63.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_79 = new HashMap<>();
    headers_79.put("accept", "*/*");
    headers_79.put("accept-encoding", "gzip, deflate, br");
    headers_79.put("accept-language", "es-419,es;q=0.9");
    headers_79.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_79.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_79.put("sec-ch-ua-mobile", "?0");
    headers_79.put("sec-ch-ua-platform", "macOS");
    headers_79.put("sec-fetch-dest", "empty");
    headers_79.put("sec-fetch-mode", "cors");
    headers_79.put("sec-fetch-site", "cross-site");
    headers_79.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_109 = new HashMap<>();
    headers_109.put("Content-Type", "application/x-www-form-urlencoded");
    headers_109.put("Origin", "https://cor-staging-1.xyz");
    headers_109.put("Upgrade-Insecure-Requests", "1");
    headers_109.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_109.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_109.put("sec-ch-ua-mobile", "?0");
    headers_109.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_110 = new HashMap<>();
    headers_110.put("accept", "*/*");
    headers_110.put("accept-encoding", "gzip, deflate, br");
    headers_110.put("accept-language", "es-419,es;q=0.9");
    headers_110.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_110.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_110.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_110.put("sec-ch-ua-mobile", "?0");
    headers_110.put("sec-ch-ua-platform", "macOS");
    headers_110.put("sec-fetch-dest", "empty");
    headers_110.put("sec-fetch-mode", "cors");
    headers_110.put("sec-fetch-site", "cross-site");
    headers_110.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_125 = new HashMap<>();
    headers_125.put("accept", "*/*");
    headers_125.put("accept-encoding", "gzip, deflate, br");
    headers_125.put("accept-language", "es-419,es;q=0.9");
    headers_125.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_125.put("sec-ch-ua-mobile", "?0");
    headers_125.put("sec-ch-ua-platform", "macOS");
    headers_125.put("sec-fetch-dest", "empty");
    headers_125.put("sec-fetch-mode", "cors");
    headers_125.put("sec-fetch-site", "same-origin");
    headers_125.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_125.put("x-requested-with", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_126 = new HashMap<>();
    headers_126.put("Accept", "*/*");
    headers_126.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_126.put("X-Requested-With", "XMLHttpRequest");
    headers_126.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_126.put("sec-ch-ua-mobile", "?0");
    headers_126.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_131 = new HashMap<>();
    headers_131.put("accept", "*/*");
    headers_131.put("accept-encoding", "gzip, deflate, br");
    headers_131.put("accept-language", "es-419,es;q=0.9");
    headers_131.put("access-control-request-headers", "authorization");
    headers_131.put("access-control-request-method", "GET");
    headers_131.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_131.put("sec-fetch-dest", "empty");
    headers_131.put("sec-fetch-mode", "cors");
    headers_131.put("sec-fetch-site", "cross-site");
    headers_131.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_135 = new HashMap<>();
    headers_135.put("accept", "*/*");
    headers_135.put("accept-encoding", "gzip, deflate, br");
    headers_135.put("accept-language", "es-419,es;q=0.9");
    headers_135.put("access-control-request-headers", "authorization,content-type,x-user-type");
    headers_135.put("access-control-request-method", "POST");
    headers_135.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_135.put("sec-fetch-dest", "empty");
    headers_135.put("sec-fetch-mode", "cors");
    headers_135.put("sec-fetch-site", "same-site");
    headers_135.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_137 = new HashMap<>();
    headers_137.put("Accept", "*/*");
    headers_137.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_137.put("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjMzODEwLCJkYXRhIjp7InVzZXJfaGFzaCI6IjI2YWI1ZjVlOTk2ZTM2OTYwMjVkMGQ5ZWNiNWZkNTJiIiwiaXNfY29udGFjdCI6ZmFsc2UsImVudiI6InN0YWdpbmcxIiwicGVybWlzc2lvbnMiOnsicGVybWlzc2lvbnMiOnsicXVvdGF0aW9ucyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInByb3llY3RvcyI6eyJhcmNoaXZlIjp0cnVlLCJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZSwiZGVsZXRlRmlsZSI6dHJ1ZX0sInRhc2tzIjp7ImFyY2hpdmUiOnRydWUsInZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlLCJ2aWV3VXNlckNhcGFjaXR5Ijp0cnVlLCJ2aWV3SG91cnMiOnRydWUsImNyZWF0ZVN1YlRhc2tzIjp0cnVlLCJ2aWV3VGFza3NPcHRpb25zIjp0cnVlLCJkZWxldGVGaWxlIjp0cnVlLCJ1cGRhdGVEZXNjcmlwdGlvbiI6dHJ1ZX0sInRhc2tzX2RlYWRsaW5lIjp7InZpZXciOmZhbHNlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sImNsaWVudHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJ1c2VycyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInNldHRpbmdzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6ZmFsc2UsImRlbGV0ZSI6ZmFsc2V9LCJwYXNzd29yZHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJjb250YWN0cyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sIm5vdGlmaWNhdGlvbnMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjpmYWxzZSwiZGVsZXRlIjpmYWxzZX0sImhvdXJzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfSwicHJvamVjdF90ZW1wbGF0ZXMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJtZXRyaWNzIjp7InZpZXciOnRydWUsImVkaXQiOmZhbHNlLCJjcmVhdGUiOmZhbHNlLCJkZWxldGUiOmZhbHNlfSwiZ2FudHQiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOmZhbHNlfSwic2FsYXJ5Ijp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfX0sImFjY2Vzc190eXBlIjp7InF1b3RhdGlvbnMiOiIxIiwicHJveWVjdG9zIjoiMSIsInRhc2tzIjoiMSIsInRhc2tzX2RlYWRsaW5lIjoiMSIsImNsaWVudHMiOiIxIiwidXNlcnMiOiIxIiwic2V0dGluZ3MiOiIxIiwicGFzc3dvcmRzIjoiMiIsImNvbnRhY3RzIjoiMSIsIm5vdGlmaWNhdGlvbnMiOiIxIiwiaG91cnMiOiIxIiwicHJvamVjdF90ZW1wbGF0ZXMiOiIxIiwibWV0cmljcyI6IjEiLCJnYW50dCI6IjEiLCJzYWxhcnkiOiIxIn19fSwiaWF0IjoxNjU1MjI3OTg1LCJleHAiOjE2NTUyMzE1ODUsImF1ZCI6IkNPUjpBUElTRVJWSUNFUyJ9.v2_WH0Z2QBWlkG0Vu44iBRPC3lLrcOaROuVH3UeLqSQ");
    headers_137.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_137.put("sec-ch-ua-mobile", "?0");
    headers_137.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_138 = new HashMap<>();
    headers_138.put("accept", "*/*");
    headers_138.put("accept-encoding", "gzip, deflate, br");
    headers_138.put("accept-language", "es-419,es;q=0.9");
    headers_138.put("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjMzODEwLCJkYXRhIjp7InVzZXJfaGFzaCI6IjI2YWI1ZjVlOTk2ZTM2OTYwMjVkMGQ5ZWNiNWZkNTJiIiwiaXNfY29udGFjdCI6ZmFsc2UsImVudiI6InN0YWdpbmcxIiwicGVybWlzc2lvbnMiOnsicGVybWlzc2lvbnMiOnsicXVvdGF0aW9ucyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInByb3llY3RvcyI6eyJhcmNoaXZlIjp0cnVlLCJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZSwiZGVsZXRlRmlsZSI6dHJ1ZX0sInRhc2tzIjp7ImFyY2hpdmUiOnRydWUsInZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlLCJ2aWV3VXNlckNhcGFjaXR5Ijp0cnVlLCJ2aWV3SG91cnMiOnRydWUsImNyZWF0ZVN1YlRhc2tzIjp0cnVlLCJ2aWV3VGFza3NPcHRpb25zIjp0cnVlLCJkZWxldGVGaWxlIjp0cnVlLCJ1cGRhdGVEZXNjcmlwdGlvbiI6dHJ1ZX0sInRhc2tzX2RlYWRsaW5lIjp7InZpZXciOmZhbHNlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sImNsaWVudHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJ1c2VycyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInNldHRpbmdzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6ZmFsc2UsImRlbGV0ZSI6ZmFsc2V9LCJwYXNzd29yZHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJjb250YWN0cyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sIm5vdGlmaWNhdGlvbnMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjpmYWxzZSwiZGVsZXRlIjpmYWxzZX0sImhvdXJzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfSwicHJvamVjdF90ZW1wbGF0ZXMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJtZXRyaWNzIjp7InZpZXciOnRydWUsImVkaXQiOmZhbHNlLCJjcmVhdGUiOmZhbHNlLCJkZWxldGUiOmZhbHNlfSwiZ2FudHQiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOmZhbHNlfSwic2FsYXJ5Ijp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfX0sImFjY2Vzc190eXBlIjp7InF1b3RhdGlvbnMiOiIxIiwicHJveWVjdG9zIjoiMSIsInRhc2tzIjoiMSIsInRhc2tzX2RlYWRsaW5lIjoiMSIsImNsaWVudHMiOiIxIiwidXNlcnMiOiIxIiwic2V0dGluZ3MiOiIxIiwicGFzc3dvcmRzIjoiMiIsImNvbnRhY3RzIjoiMSIsIm5vdGlmaWNhdGlvbnMiOiIxIiwiaG91cnMiOiIxIiwicHJvamVjdF90ZW1wbGF0ZXMiOiIxIiwibWV0cmljcyI6IjEiLCJnYW50dCI6IjEiLCJzYWxhcnkiOiIxIn19fSwiaWF0IjoxNjU1MjI3OTg1LCJleHAiOjE2NTUyMzE1ODUsImF1ZCI6IkNPUjpBUElTRVJWSUNFUyJ9.v2_WH0Z2QBWlkG0Vu44iBRPC3lLrcOaROuVH3UeLqSQ");
    headers_138.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_138.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_138.put("sec-ch-ua-mobile", "?0");
    headers_138.put("sec-ch-ua-platform", "macOS");
    headers_138.put("sec-fetch-dest", "empty");
    headers_138.put("sec-fetch-mode", "cors");
    headers_138.put("sec-fetch-site", "same-site");
    headers_138.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_157 = new HashMap<>();
    headers_157.put("accept", "*/*");
    headers_157.put("accept-encoding", "gzip, deflate, br");
    headers_157.put("accept-language", "es-419,es;q=0.9");
    headers_157.put("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjMzODEwLCJkYXRhIjp7InVzZXJfaGFzaCI6IjI2YWI1ZjVlOTk2ZTM2OTYwMjVkMGQ5ZWNiNWZkNTJiIiwiaXNfY29udGFjdCI6ZmFsc2UsImVudiI6InN0YWdpbmcxIiwicGVybWlzc2lvbnMiOnsicGVybWlzc2lvbnMiOnsicXVvdGF0aW9ucyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInByb3llY3RvcyI6eyJhcmNoaXZlIjp0cnVlLCJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZSwiZGVsZXRlRmlsZSI6dHJ1ZX0sInRhc2tzIjp7ImFyY2hpdmUiOnRydWUsInZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlLCJ2aWV3VXNlckNhcGFjaXR5Ijp0cnVlLCJ2aWV3SG91cnMiOnRydWUsImNyZWF0ZVN1YlRhc2tzIjp0cnVlLCJ2aWV3VGFza3NPcHRpb25zIjp0cnVlLCJkZWxldGVGaWxlIjp0cnVlLCJ1cGRhdGVEZXNjcmlwdGlvbiI6dHJ1ZX0sInRhc2tzX2RlYWRsaW5lIjp7InZpZXciOmZhbHNlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sImNsaWVudHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJ1c2VycyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInNldHRpbmdzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6ZmFsc2UsImRlbGV0ZSI6ZmFsc2V9LCJwYXNzd29yZHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJjb250YWN0cyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sIm5vdGlmaWNhdGlvbnMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjpmYWxzZSwiZGVsZXRlIjpmYWxzZX0sImhvdXJzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfSwicHJvamVjdF90ZW1wbGF0ZXMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJtZXRyaWNzIjp7InZpZXciOnRydWUsImVkaXQiOmZhbHNlLCJjcmVhdGUiOmZhbHNlLCJkZWxldGUiOmZhbHNlfSwiZ2FudHQiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOmZhbHNlfSwic2FsYXJ5Ijp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfX0sImFjY2Vzc190eXBlIjp7InF1b3RhdGlvbnMiOiIxIiwicHJveWVjdG9zIjoiMSIsInRhc2tzIjoiMSIsInRhc2tzX2RlYWRsaW5lIjoiMSIsImNsaWVudHMiOiIxIiwidXNlcnMiOiIxIiwic2V0dGluZ3MiOiIxIiwicGFzc3dvcmRzIjoiMiIsImNvbnRhY3RzIjoiMSIsIm5vdGlmaWNhdGlvbnMiOiIxIiwiaG91cnMiOiIxIiwicHJvamVjdF90ZW1wbGF0ZXMiOiIxIiwibWV0cmljcyI6IjEiLCJnYW50dCI6IjEiLCJzYWxhcnkiOiIxIn19fSwiaWF0IjoxNjU1MjI3OTg1LCJleHAiOjE2NTUyMzE1ODUsImF1ZCI6IkNPUjpBUElTRVJWSUNFUyJ9.v2_WH0Z2QBWlkG0Vu44iBRPC3lLrcOaROuVH3UeLqSQ");
    headers_157.put("content-type", "application/json");
    headers_157.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_157.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_157.put("sec-ch-ua-mobile", "?0");
    headers_157.put("sec-ch-ua-platform", "macOS");
    headers_157.put("sec-fetch-dest", "empty");
    headers_157.put("sec-fetch-mode", "cors");
    headers_157.put("sec-fetch-site", "same-site");
    headers_157.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_157.put("x-user-type", "1");
    
    Map<CharSequence, String> headers_159 = new HashMap<>();
    headers_159.put("Accept", "*/*");
    headers_159.put("Accept-Encoding", "gzip, deflate, br");
    headers_159.put("Accept-Language", "es-419,es;q=0.9");
    headers_159.put("Sec-Fetch-Dest", "empty");
    headers_159.put("Sec-Fetch-Mode", "no-cors");
    headers_159.put("Sec-Fetch-Site", "cross-site");
    headers_159.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_159.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_159.put("sec-ch-ua-mobile", "?0");
    headers_159.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_161 = new HashMap<>();
    headers_161.put("accept", "*/*");
    headers_161.put("accept-encoding", "gzip, deflate, br");
    headers_161.put("accept-language", "es-419,es;q=0.9");
    headers_161.put("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjMzODEwLCJkYXRhIjp7InVzZXJfaGFzaCI6IjI2YWI1ZjVlOTk2ZTM2OTYwMjVkMGQ5ZWNiNWZkNTJiIiwiaXNfY29udGFjdCI6ZmFsc2UsImVudiI6InN0YWdpbmcxIiwicGVybWlzc2lvbnMiOnsicGVybWlzc2lvbnMiOnsicXVvdGF0aW9ucyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInByb3llY3RvcyI6eyJhcmNoaXZlIjp0cnVlLCJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZSwiZGVsZXRlRmlsZSI6dHJ1ZX0sInRhc2tzIjp7ImFyY2hpdmUiOnRydWUsInZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlLCJ2aWV3VXNlckNhcGFjaXR5Ijp0cnVlLCJ2aWV3SG91cnMiOnRydWUsImNyZWF0ZVN1YlRhc2tzIjp0cnVlLCJ2aWV3VGFza3NPcHRpb25zIjp0cnVlLCJkZWxldGVGaWxlIjp0cnVlLCJ1cGRhdGVEZXNjcmlwdGlvbiI6dHJ1ZX0sInRhc2tzX2RlYWRsaW5lIjp7InZpZXciOmZhbHNlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sImNsaWVudHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJ1c2VycyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInNldHRpbmdzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6ZmFsc2UsImRlbGV0ZSI6ZmFsc2V9LCJwYXNzd29yZHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJjb250YWN0cyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sIm5vdGlmaWNhdGlvbnMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjpmYWxzZSwiZGVsZXRlIjpmYWxzZX0sImhvdXJzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfSwicHJvamVjdF90ZW1wbGF0ZXMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJtZXRyaWNzIjp7InZpZXciOnRydWUsImVkaXQiOmZhbHNlLCJjcmVhdGUiOmZhbHNlLCJkZWxldGUiOmZhbHNlfSwiZ2FudHQiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOmZhbHNlfSwic2FsYXJ5Ijp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfX0sImFjY2Vzc190eXBlIjp7InF1b3RhdGlvbnMiOiIxIiwicHJveWVjdG9zIjoiMSIsInRhc2tzIjoiMSIsInRhc2tzX2RlYWRsaW5lIjoiMSIsImNsaWVudHMiOiIxIiwidXNlcnMiOiIxIiwic2V0dGluZ3MiOiIxIiwicGFzc3dvcmRzIjoiMiIsImNvbnRhY3RzIjoiMSIsIm5vdGlmaWNhdGlvbnMiOiIxIiwiaG91cnMiOiIxIiwicHJvamVjdF90ZW1wbGF0ZXMiOiIxIiwibWV0cmljcyI6IjEiLCJnYW50dCI6IjEiLCJzYWxhcnkiOiIxIn19fSwiaWF0IjoxNjU1MjI3OTg1LCJleHAiOjE2NTUyMzE1ODUsImF1ZCI6IkNPUjpBUElTRVJWSUNFUyJ9.v2_WH0Z2QBWlkG0Vu44iBRPC3lLrcOaROuVH3UeLqSQ");
    headers_161.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_161.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_161.put("sec-ch-ua-mobile", "?0");
    headers_161.put("sec-ch-ua-platform", "macOS");
    headers_161.put("sec-fetch-dest", "empty");
    headers_161.put("sec-fetch-mode", "cors");
    headers_161.put("sec-fetch-site", "cross-site");
    headers_161.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_162 = new HashMap<>();
    headers_162.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_162.put("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjMzODEwLCJkYXRhIjp7InVzZXJfaGFzaCI6IjI2YWI1ZjVlOTk2ZTM2OTYwMjVkMGQ5ZWNiNWZkNTJiIiwiaXNfY29udGFjdCI6ZmFsc2UsImVudiI6InN0YWdpbmcxIiwicGVybWlzc2lvbnMiOnsicGVybWlzc2lvbnMiOnsicXVvdGF0aW9ucyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInByb3llY3RvcyI6eyJhcmNoaXZlIjp0cnVlLCJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZSwiZGVsZXRlRmlsZSI6dHJ1ZX0sInRhc2tzIjp7ImFyY2hpdmUiOnRydWUsInZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlLCJ2aWV3VXNlckNhcGFjaXR5Ijp0cnVlLCJ2aWV3SG91cnMiOnRydWUsImNyZWF0ZVN1YlRhc2tzIjp0cnVlLCJ2aWV3VGFza3NPcHRpb25zIjp0cnVlLCJkZWxldGVGaWxlIjp0cnVlLCJ1cGRhdGVEZXNjcmlwdGlvbiI6dHJ1ZX0sInRhc2tzX2RlYWRsaW5lIjp7InZpZXciOmZhbHNlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sImNsaWVudHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJ1c2VycyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInNldHRpbmdzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6ZmFsc2UsImRlbGV0ZSI6ZmFsc2V9LCJwYXNzd29yZHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJjb250YWN0cyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sIm5vdGlmaWNhdGlvbnMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjpmYWxzZSwiZGVsZXRlIjpmYWxzZX0sImhvdXJzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfSwicHJvamVjdF90ZW1wbGF0ZXMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJtZXRyaWNzIjp7InZpZXciOnRydWUsImVkaXQiOmZhbHNlLCJjcmVhdGUiOmZhbHNlLCJkZWxldGUiOmZhbHNlfSwiZ2FudHQiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOmZhbHNlfSwic2FsYXJ5Ijp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfX0sImFjY2Vzc190eXBlIjp7InF1b3RhdGlvbnMiOiIxIiwicHJveWVjdG9zIjoiMSIsInRhc2tzIjoiMSIsInRhc2tzX2RlYWRsaW5lIjoiMSIsImNsaWVudHMiOiIxIiwidXNlcnMiOiIxIiwic2V0dGluZ3MiOiIxIiwicGFzc3dvcmRzIjoiMiIsImNvbnRhY3RzIjoiMSIsIm5vdGlmaWNhdGlvbnMiOiIxIiwiaG91cnMiOiIxIiwicHJvamVjdF90ZW1wbGF0ZXMiOiIxIiwibWV0cmljcyI6IjEiLCJnYW50dCI6IjEiLCJzYWxhcnkiOiIxIn19fSwiaWF0IjoxNjU1MjI3OTg1LCJleHAiOjE2NTUyMzE1ODUsImF1ZCI6IkNPUjpBUElTRVJWSUNFUyJ9.v2_WH0Z2QBWlkG0Vu44iBRPC3lLrcOaROuVH3UeLqSQ");
    headers_162.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_162.put("sec-ch-ua-mobile", "?0");
    headers_162.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_167 = new HashMap<>();
    headers_167.put("accept", "*/*");
    headers_167.put("accept-encoding", "gzip, deflate, br");
    headers_167.put("accept-language", "es-419,es;q=0.9");
    headers_167.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_167.put("sec-ch-ua-mobile", "?0");
    headers_167.put("sec-ch-ua-platform", "macOS");
    headers_167.put("sec-fetch-dest", "empty");
    headers_167.put("sec-fetch-mode", "cors");
    headers_167.put("sec-fetch-site", "same-origin");
    headers_167.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_178 = new HashMap<>();
    headers_178.put("accept", "*/*");
    headers_178.put("accept-encoding", "gzip, deflate, br");
    headers_178.put("accept-language", "es-419,es;q=0.9");
    headers_178.put("content-type", "text/plain;charset=UTF-8");
    headers_178.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_178.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_178.put("sec-ch-ua-mobile", "?0");
    headers_178.put("sec-ch-ua-platform", "macOS");
    headers_178.put("sec-fetch-dest", "empty");
    headers_178.put("sec-fetch-mode", "no-cors");
    headers_178.put("sec-fetch-site", "cross-site");
    headers_178.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_183 = new HashMap<>();
    headers_183.put("accept", "*/*");
    headers_183.put("accept-encoding", "gzip, deflate, br");
    headers_183.put("accept-language", "es-419,es;q=0.9");
    headers_183.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_183.put("sec-ch-ua-mobile", "?0");
    headers_183.put("sec-ch-ua-platform", "macOS");
    headers_183.put("sec-fetch-dest", "empty");
    headers_183.put("sec-fetch-mode", "no-cors");
    headers_183.put("sec-fetch-site", "cross-site");
    headers_183.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_206 = new HashMap<>();
    headers_206.put("accept", "*/*");
    headers_206.put("accept-encoding", "gzip, deflate, br");
    headers_206.put("accept-language", "es-419,es;q=0.9");
    headers_206.put("access-control-request-headers", "x-hubspot-messages-uri");
    headers_206.put("access-control-request-method", "GET");
    headers_206.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_206.put("sec-fetch-dest", "empty");
    headers_206.put("sec-fetch-mode", "cors");
    headers_206.put("sec-fetch-site", "cross-site");
    headers_206.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_211 = new HashMap<>();
    headers_211.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_211.put("X-HubSpot-Messages-Uri", "https://demo-sp.cor-staging-1.xyz/?&archived=2&taskType=i_am_collaborator");
    headers_211.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_211.put("sec-ch-ua-mobile", "?0");
    headers_211.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_212 = new HashMap<>();
    headers_212.put("accept", "*/*");
    headers_212.put("accept-encoding", "gzip, deflate, br");
    headers_212.put("accept-language", "es-419,es;q=0.9");
    headers_212.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_212.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_212.put("sec-ch-ua-mobile", "?0");
    headers_212.put("sec-ch-ua-platform", "macOS");
    headers_212.put("sec-fetch-dest", "empty");
    headers_212.put("sec-fetch-mode", "cors");
    headers_212.put("sec-fetch-site", "cross-site");
    headers_212.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_212.put("x-hubspot-messages-uri", "https://demo-sp.cor-staging-1.xyz/?&archived=2&taskType=i_am_collaborator");
    
    Map<CharSequence, String> headers_219 = new HashMap<>();
    headers_219.put("accept", "*/*");
    headers_219.put("accept-encoding", "gzip, deflate, br");
    headers_219.put("accept-language", "es-419,es;q=0.9");
    headers_219.put("access-control-request-headers", "authorization,content-type");
    headers_219.put("access-control-request-method", "POST");
    headers_219.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_219.put("sec-fetch-dest", "empty");
    headers_219.put("sec-fetch-mode", "cors");
    headers_219.put("sec-fetch-site", "cross-site");
    headers_219.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_220 = new HashMap<>();
    headers_220.put("accept", "*/*");
    headers_220.put("accept-encoding", "gzip, deflate, br");
    headers_220.put("accept-language", "es-419,es;q=0.9");
    headers_220.put("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjMzODEwLCJkYXRhIjp7InVzZXJfaGFzaCI6IjI2YWI1ZjVlOTk2ZTM2OTYwMjVkMGQ5ZWNiNWZkNTJiIiwiaXNfY29udGFjdCI6ZmFsc2UsImVudiI6InN0YWdpbmcxIiwicGVybWlzc2lvbnMiOnsicGVybWlzc2lvbnMiOnsicXVvdGF0aW9ucyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInByb3llY3RvcyI6eyJhcmNoaXZlIjp0cnVlLCJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZSwiZGVsZXRlRmlsZSI6dHJ1ZX0sInRhc2tzIjp7ImFyY2hpdmUiOnRydWUsInZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlLCJ2aWV3VXNlckNhcGFjaXR5Ijp0cnVlLCJ2aWV3SG91cnMiOnRydWUsImNyZWF0ZVN1YlRhc2tzIjp0cnVlLCJ2aWV3VGFza3NPcHRpb25zIjp0cnVlLCJkZWxldGVGaWxlIjp0cnVlLCJ1cGRhdGVEZXNjcmlwdGlvbiI6dHJ1ZX0sInRhc2tzX2RlYWRsaW5lIjp7InZpZXciOmZhbHNlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sImNsaWVudHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJ1c2VycyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInNldHRpbmdzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6ZmFsc2UsImRlbGV0ZSI6ZmFsc2V9LCJwYXNzd29yZHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJjb250YWN0cyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sIm5vdGlmaWNhdGlvbnMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjpmYWxzZSwiZGVsZXRlIjpmYWxzZX0sImhvdXJzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfSwicHJvamVjdF90ZW1wbGF0ZXMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJtZXRyaWNzIjp7InZpZXciOnRydWUsImVkaXQiOmZhbHNlLCJjcmVhdGUiOmZhbHNlLCJkZWxldGUiOmZhbHNlfSwiZ2FudHQiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOmZhbHNlfSwic2FsYXJ5Ijp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfX0sImFjY2Vzc190eXBlIjp7InF1b3RhdGlvbnMiOiIxIiwicHJveWVjdG9zIjoiMSIsInRhc2tzIjoiMSIsInRhc2tzX2RlYWRsaW5lIjoiMSIsImNsaWVudHMiOiIxIiwidXNlcnMiOiIxIiwic2V0dGluZ3MiOiIxIiwicGFzc3dvcmRzIjoiMiIsImNvbnRhY3RzIjoiMSIsIm5vdGlmaWNhdGlvbnMiOiIxIiwiaG91cnMiOiIxIiwicHJvamVjdF90ZW1wbGF0ZXMiOiIxIiwibWV0cmljcyI6IjEiLCJnYW50dCI6IjEiLCJzYWxhcnkiOiIxIn19fSwiaWF0IjoxNjU1MjI3OTg1LCJleHAiOjE2NTUyMzE1ODUsImF1ZCI6IkNPUjpBUElTRVJWSUNFUyJ9.v2_WH0Z2QBWlkG0Vu44iBRPC3lLrcOaROuVH3UeLqSQ");
    headers_220.put("content-type", "application/json");
    headers_220.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_220.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_220.put("sec-ch-ua-mobile", "?0");
    headers_220.put("sec-ch-ua-platform", "macOS");
    headers_220.put("sec-fetch-dest", "empty");
    headers_220.put("sec-fetch-mode", "cors");
    headers_220.put("sec-fetch-site", "cross-site");
    headers_220.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_222 = new HashMap<>();
    headers_222.put("Accept", "*/*");
    headers_222.put("Accept-Encoding", "gzip, deflate, br");
    headers_222.put("Accept-Language", "es-419,es;q=0.9");
    headers_222.put("Access-Control-Request-Headers", "content-type");
    headers_222.put("Access-Control-Request-Method", "POST");
    headers_222.put("Origin", "https://demo-sp.cor-staging-1.xyz");
    headers_222.put("Sec-Fetch-Dest", "empty");
    headers_222.put("Sec-Fetch-Mode", "cors");
    headers_222.put("Sec-Fetch-Site", "cross-site");
    headers_222.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_224 = new HashMap<>();
    headers_224.put("Accept", "application/json, text/plain, */*");
    headers_224.put("Accept-Encoding", "gzip, deflate, br");
    headers_224.put("Accept-Language", "es-419,es;q=0.9");
    headers_224.put("Content-Type", "application/json;charset=UTF-8");
    headers_224.put("Origin", "https://demo-sp.cor-staging-1.xyz");
    headers_224.put("Sec-Fetch-Dest", "empty");
    headers_224.put("Sec-Fetch-Mode", "cors");
    headers_224.put("Sec-Fetch-Site", "cross-site");
    headers_224.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_224.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_224.put("sec-ch-ua-mobile", "?0");
    headers_224.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_255 = new HashMap<>();
    headers_255.put("Upgrade-Insecure-Requests", "1");
    headers_255.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_255.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_255.put("sec-ch-ua-mobile", "?0");
    headers_255.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_256 = new HashMap<>();
    headers_256.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_256.put("accept-encoding", "gzip, deflate, br");
    headers_256.put("accept-language", "es-419,es;q=0.9");
    headers_256.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_256.put("sec-ch-ua-mobile", "?0");
    headers_256.put("sec-ch-ua-platform", "macOS");
    headers_256.put("sec-fetch-dest", "empty");
    headers_256.put("sec-fetch-mode", "navigate");
    headers_256.put("sec-fetch-site", "same-origin");
    headers_256.put("upgrade-insecure-requests", "1");
    headers_256.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_298 = new HashMap<>();
    headers_298.put("accept", "*/*");
    headers_298.put("accept-encoding", "gzip, deflate, br");
    headers_298.put("accept-language", "es-419,es;q=0.9");
    headers_298.put("access-control-request-headers", "authorization");
    headers_298.put("access-control-request-method", "GET");
    headers_298.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_298.put("sec-fetch-dest", "empty");
    headers_298.put("sec-fetch-mode", "cors");
    headers_298.put("sec-fetch-site", "same-site");
    headers_298.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_354 = new HashMap<>();
    headers_354.put("accept", "*/*");
    headers_354.put("accept-encoding", "gzip, deflate, br");
    headers_354.put("accept-language", "es-419,es;q=0.9");
    headers_354.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_354.put("sec-fetch-dest", "empty");
    headers_354.put("sec-fetch-mode", "cors");
    headers_354.put("sec-fetch-site", "cross-site");
    headers_354.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_402 = new HashMap<>();
    headers_402.put("accept", "*/*");
    headers_402.put("accept-encoding", "gzip, deflate, br");
    headers_402.put("accept-language", "es-419,es;q=0.9");
    headers_402.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_402.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_402.put("sec-ch-ua-mobile", "?0");
    headers_402.put("sec-ch-ua-platform", "macOS");
    headers_402.put("sec-fetch-dest", "empty");
    headers_402.put("sec-fetch-mode", "cors");
    headers_402.put("sec-fetch-site", "cross-site");
    headers_402.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_402.put("x-hubspot-messages-uri", "https://demo-sp.cor-staging-1.xyz/projects?page=1&archived=2");
    
    Map<CharSequence, String> headers_403 = new HashMap<>();
    headers_403.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_403.put("X-HubSpot-Messages-Uri", "https://demo-sp.cor-staging-1.xyz/projects?page=1&archived=2");
    headers_403.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_403.put("sec-ch-ua-mobile", "?0");
    headers_403.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_447 = new HashMap<>();
    headers_447.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_447.put("accept-encoding", "gzip, deflate, br");
    headers_447.put("accept-language", "es-419,es;q=0.9");
    headers_447.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_447.put("sec-ch-ua-mobile", "?0");
    headers_447.put("sec-ch-ua-platform", "macOS");
    headers_447.put("sec-fetch-dest", "empty");
    headers_447.put("sec-fetch-mode", "no-cors");
    headers_447.put("sec-fetch-site", "same-origin");
    headers_447.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_535 = new HashMap<>();
    headers_535.put("Accept-Encoding", "identity;q=1, *;q=0");
    headers_535.put("Range", "bytes=0-");
    headers_535.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_535.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_535.put("sec-ch-ua-mobile", "?0");
    headers_535.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_536 = new HashMap<>();
    headers_536.put("accept", "*/*");
    headers_536.put("accept-encoding", "identity;q=1, *;q=0");
    headers_536.put("accept-language", "es-419,es;q=0.9");
    headers_536.put("range", "bytes=0-28420");
    headers_536.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_536.put("sec-ch-ua-mobile", "?0");
    headers_536.put("sec-ch-ua-platform", "macOS");
    headers_536.put("sec-fetch-dest", "empty");
    headers_536.put("sec-fetch-mode", "no-cors");
    headers_536.put("sec-fetch-site", "same-origin");
    headers_536.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_548 = new HashMap<>();
    headers_548.put("accept", "*/*");
    headers_548.put("accept-encoding", "gzip, deflate, br");
    headers_548.put("accept-language", "es-419,es;q=0.9");
    headers_548.put("access-control-request-headers", "authorization");
    headers_548.put("access-control-request-method", "POST");
    headers_548.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_548.put("sec-fetch-dest", "empty");
    headers_548.put("sec-fetch-mode", "cors");
    headers_548.put("sec-fetch-site", "same-site");
    headers_548.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_550 = new HashMap<>();
    headers_550.put("accept", "*/*");
    headers_550.put("accept-encoding", "gzip, deflate, br");
    headers_550.put("accept-language", "es-419,es;q=0.9");
    headers_550.put("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjMzODEwLCJkYXRhIjp7InVzZXJfaGFzaCI6IjI2YWI1ZjVlOTk2ZTM2OTYwMjVkMGQ5ZWNiNWZkNTJiIiwiaXNfY29udGFjdCI6ZmFsc2UsImVudiI6InN0YWdpbmcxIiwicGVybWlzc2lvbnMiOnsicGVybWlzc2lvbnMiOnsicXVvdGF0aW9ucyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInByb3llY3RvcyI6eyJhcmNoaXZlIjp0cnVlLCJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZSwiZGVsZXRlRmlsZSI6dHJ1ZX0sInRhc2tzIjp7ImFyY2hpdmUiOnRydWUsInZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlLCJ2aWV3VXNlckNhcGFjaXR5Ijp0cnVlLCJ2aWV3SG91cnMiOnRydWUsImNyZWF0ZVN1YlRhc2tzIjp0cnVlLCJ2aWV3VGFza3NPcHRpb25zIjp0cnVlLCJkZWxldGVGaWxlIjp0cnVlLCJ1cGRhdGVEZXNjcmlwdGlvbiI6dHJ1ZX0sInRhc2tzX2RlYWRsaW5lIjp7InZpZXciOmZhbHNlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sImNsaWVudHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJ1c2VycyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sInNldHRpbmdzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6ZmFsc2UsImRlbGV0ZSI6ZmFsc2V9LCJwYXNzd29yZHMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJjb250YWN0cyI6eyJ2aWV3Ijp0cnVlLCJlZGl0Ijp0cnVlLCJjcmVhdGUiOnRydWUsImRlbGV0ZSI6dHJ1ZX0sIm5vdGlmaWNhdGlvbnMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjpmYWxzZSwiZGVsZXRlIjpmYWxzZX0sImhvdXJzIjp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfSwicHJvamVjdF90ZW1wbGF0ZXMiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOnRydWV9LCJtZXRyaWNzIjp7InZpZXciOnRydWUsImVkaXQiOmZhbHNlLCJjcmVhdGUiOmZhbHNlLCJkZWxldGUiOmZhbHNlfSwiZ2FudHQiOnsidmlldyI6dHJ1ZSwiZWRpdCI6dHJ1ZSwiY3JlYXRlIjp0cnVlLCJkZWxldGUiOmZhbHNlfSwic2FsYXJ5Ijp7InZpZXciOnRydWUsImVkaXQiOnRydWUsImNyZWF0ZSI6dHJ1ZSwiZGVsZXRlIjp0cnVlfX0sImFjY2Vzc190eXBlIjp7InF1b3RhdGlvbnMiOiIxIiwicHJveWVjdG9zIjoiMSIsInRhc2tzIjoiMSIsInRhc2tzX2RlYWRsaW5lIjoiMSIsImNsaWVudHMiOiIxIiwidXNlcnMiOiIxIiwic2V0dGluZ3MiOiIxIiwicGFzc3dvcmRzIjoiMiIsImNvbnRhY3RzIjoiMSIsIm5vdGlmaWNhdGlvbnMiOiIxIiwiaG91cnMiOiIxIiwicHJvamVjdF90ZW1wbGF0ZXMiOiIxIiwibWV0cmljcyI6IjEiLCJnYW50dCI6IjEiLCJzYWxhcnkiOiIxIn19fSwiaWF0IjoxNjU1MjI3OTg1LCJleHAiOjE2NTUyMzE1ODUsImF1ZCI6IkNPUjpBUElTRVJWSUNFUyJ9.v2_WH0Z2QBWlkG0Vu44iBRPC3lLrcOaROuVH3UeLqSQ");
    headers_550.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_550.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_550.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_550.put("sec-ch-ua-mobile", "?0");
    headers_550.put("sec-ch-ua-platform", "macOS");
    headers_550.put("sec-fetch-dest", "empty");
    headers_550.put("sec-fetch-mode", "cors");
    headers_550.put("sec-fetch-site", "same-site");
    headers_550.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_569 = new HashMap<>();
    headers_569.put("accept", "*/*");
    headers_569.put("accept-encoding", "gzip, deflate, br");
    headers_569.put("accept-language", "es-419,es;q=0.9");
    headers_569.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_569.put("sec-ch-ua-mobile", "?0");
    headers_569.put("sec-ch-ua-platform", "macOS");
    headers_569.put("sec-fetch-dest", "empty");
    headers_569.put("sec-fetch-mode", "no-cors");
    headers_569.put("sec-fetch-site", "same-origin");
    headers_569.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_574 = new HashMap<>();
    headers_574.put("accept", "text/css,*/*;q=0.1");
    headers_574.put("accept-encoding", "gzip, deflate, br");
    headers_574.put("accept-language", "es-419,es;q=0.9");
    headers_574.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_574.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_574.put("sec-ch-ua-mobile", "?0");
    headers_574.put("sec-ch-ua-platform", "macOS");
    headers_574.put("sec-fetch-dest", "style");
    headers_574.put("sec-fetch-mode", "cors");
    headers_574.put("sec-fetch-site", "cross-site");
    headers_574.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    
    Map<CharSequence, String> headers_576 = new HashMap<>();
    headers_576.put("accept", "text/css,*/*;q=0.1");
    headers_576.put("accept-encoding", "gzip, deflate, br");
    headers_576.put("accept-language", "es-419,es;q=0.9");
    headers_576.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_576.put("sec-ch-ua-mobile", "?0");
    headers_576.put("sec-ch-ua-platform", "macOS");
    headers_576.put("sec-fetch-dest", "style");
    headers_576.put("sec-fetch-mode", "no-cors");
    headers_576.put("sec-fetch-site", "cross-site");
    headers_576.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_576.put("x-client-data", "CIu2yQEIorbJAQjBtskBCKmdygEIlKHLAQjmhMwBCPuqzAEI87PMAQi/tcwB");
    
    Map<CharSequence, String> headers_580 = new HashMap<>();
    headers_580.put("accept", "*/*");
    headers_580.put("accept-encoding", "gzip, deflate, br");
    headers_580.put("accept-language", "es-419,es;q=0.9");
    headers_580.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_580.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_580.put("sec-ch-ua-mobile", "?0");
    headers_580.put("sec-ch-ua-platform", "macOS");
    headers_580.put("sec-fetch-dest", "font");
    headers_580.put("sec-fetch-mode", "cors");
    headers_580.put("sec-fetch-site", "cross-site");
    headers_580.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_580.put("x-client-data", "CIu2yQEIorbJAQjBtskBCKmdygEIlKHLAQjmhMwBCPuqzAEI87PMAQi/tcwB");
    
    Map<CharSequence, String> headers_613 = new HashMap<>();
    headers_613.put("accept", "*/*");
    headers_613.put("accept-encoding", "gzip, deflate, br");
    headers_613.put("accept-language", "es-419,es;q=0.9");
    headers_613.put("origin", "https://demo-sp.cor-staging-1.xyz");
    headers_613.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_613.put("sec-ch-ua-mobile", "?0");
    headers_613.put("sec-ch-ua-platform", "macOS");
    headers_613.put("sec-fetch-dest", "empty");
    headers_613.put("sec-fetch-mode", "cors");
    headers_613.put("sec-fetch-site", "cross-site");
    headers_613.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_613.put("x-hubspot-messages-uri", "https://demo-sp.cor-staging-1.xyz/projects/258521/dashboard?page=1&archived=2");
    
    Map<CharSequence, String> headers_615 = new HashMap<>();
    headers_615.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_615.put("X-HubSpot-Messages-Uri", "https://demo-sp.cor-staging-1.xyz/projects/258521/dashboard?page=1&archived=2");
    headers_615.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_615.put("sec-ch-ua-mobile", "?0");
    headers_615.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_628 = new HashMap<>();
    headers_628.put("Accept", "*/*");
    headers_628.put("Accept-Encoding", "gzip, deflate, br");
    headers_628.put("Accept-Language", "es-419,es;q=0.9");
    headers_628.put("Origin", "https://demo-sp.cor-staging-1.xyz");
    headers_628.put("Sec-Fetch-Dest", "empty");
    headers_628.put("Sec-Fetch-Mode", "cors");
    headers_628.put("Sec-Fetch-Site", "cross-site");
    headers_628.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_628.put("content-type", "text/plain");
    headers_628.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_628.put("sec-ch-ua-mobile", "?0");
    headers_628.put("sec-ch-ua-platform", "macOS");
    
    String uri01 = "https://connect.facebook.net";
    
    String uri02 = "https://www.google-analytics.com";
    
    String uri03 = "https://app.retently.com/api/remote/tracking/5e62cc19b7fb80064d0e93ec";
    
    String uri04 = "https://api.hubapi.com/hs-script-loader-public/v1/config/pixel/json";
    
    String uri05 = "https://vars.hotjar.com/box-63c3a81830bf549dafe40b369003f751.html";
    
    String uri06 = "https://cdn.headwayapp.co/widget.js";
    
    String uri07 = "https://bam-cell.nr-data.net";
    
    String uri08 = "https://cdn.retently.com/public/components/embed/sdk.min.js";
    
    String uri09 = "https://usage.clientsuccess.com/collector/1.0.0/projects/66e46bd0aff543b6a8e87fa8680fb919/events/Pageview";
    
    String uri10 = "https://static.zdassets.com";
    
    String uri12 = "https://cdn.clientsuccess.com/csTrack.min.js";
    
    String uri13 = "https://cor.zendesk.com";
    
    String uri14 = "https://notifications.sls.staging.projectcor.com/notifications/counter";
    
    String uri15 = "https://track.hubspot.com/__ptq.gif";
    
    String uri16 = "https://js.usemessages.com/conversations-embed.js";
    
    String uri17 = "https://js.hs-scripts.com/2960453.js";
    
    String uri18 = "https://d2s2a3xlfnyshr.cloudfront.net";
    
    String uri19 = "https://d24n15hnbwhuhn.cloudfront.net/libs/amplitude-3.4.1-min.gz.js";
    
    String uri20 = "https://www.googletagmanager.com";
    
    String uri21 = "https://graphql.services.cor-staging-1.xyz";
    
    String uri22 = "https://js.hs-banner.com/2960453.js";
    
    String uri23 = "https://demo-sp.cor-staging-1.xyz";
    
    String uri24 = "https://js.hsadspixel.net/fb.js";
    
    String uri25 = "https://api.services.cor-staging-1.xyz";
    
    String uri26 = "https://browser.sentry-cdn.com/6.10.0/bundle.min.js";
    
    String uri27 = "https://id.zopim.com/authenticated/web/jwt";
    
    String uri28 = "https://projectcor.com/wp-content/uploads/2022/06/CollapsibleView.jpg";
    
    String uri29 = "https://js.hs-analytics.net/analytics/1655227800000/2960453.js";
    
    String uri30 = "https://cor-staging-1.xyz";
    
    String uri31 = "https://ekr.zendesk.com/compose/7b70f1ce-8a16-4be7-895f-45775342919a";
    
    String uri32 = "https://performance.sls.staging.projectcor.com/performance";
    
    String uri33 = "https://static.hotjar.com/c/hotjar-822678.js";
    
    String uri34 = "https://fonts.gstatic.com/s/opensans/v29/memvYaGs126MiZpBA-UvWbX2vVnXBbObj2OVTS-mu0SC55I.woff2";
    
    String uri35 = "https://js-agent.newrelic.com/nr-1198.min.js";
    
    String uri36 = "https://api.hubspot.com/livechat-public/v1/message/public";
    
    String uri37 = "https://script.hotjar.com/modules.b871a939666125f20d79.js";
    
    String uri38 = "https://fonts.googleapis.com/css";
    
    String uri39 = "https://user-images.staging.projectcor.com/staging1/Upload/ProfilePictures";
    
    String uri40 = "https://api.amplitude.com";
    
    String uri41 = "https://fast.appcues.com";
    
    String uri42 = "https://api.appcues.net/v1/accounts/104214/users/33810/content/36a84b09-62f9-4afe-b0f3-111f9552fb06";

    ScenarioBuilder scn = scenario("RecordedSimulation")
      .exec(
        http("request_0")
          .get(uri18 + "/public/assets/js/compiled-login.js?id=c73d2f94ef125e6010da")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get(uri18 + "/public/assets/css/compiled-login.css?id=5ced99216b04cfc0a575"),
            http("request_2")
              .get(uri18 + "/public/assets/webfonts/tuskergrotesk-4600semibold-webfont.woff2")
              .headers(headers_2),
            http("request_3")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-300.woff2")
              .headers(headers_2),
            http("request_4")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-regular.woff2")
              .headers(headers_2),
            http("request_5")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-500.woff2")
              .headers(headers_2),
            http("request_6")
              .get(uri20 + "/gtm.js?id=GTM-PJLC7NW"),
            http("request_7")
              .get(uri19),
            http("request_8")
              .get(uri20 + "/gtag/js?id=G-WSQHTY6J1Z&l=dataLayer&cx=c"),
            http("request_9")
              .get(uri02 + "/analytics.js"),
            http("request_10")
              .get(uri30 + "/login")
              .headers(headers_10),
            http("request_11")
              .get(uri30 + "/images/cor-logo.svg")
              .headers(headers_0),
            http("request_12")
              .get(uri30 + "/images/google.svg")
              .headers(headers_0),
            http("request_13")
              .get(uri17),
            http("request_14")
              .get(uri02 + "/collect?v=1&_v=j96&a=1523218920&t=pageview&_s=1&dl=https%3A%2F%2Fcor-staging-1.xyz%2Flogin&dr=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&ul=es-419&de=UTF-8&dt=Login&sd=30-bit&sr=1440x900&vp=1440x301&je=0&_u=QACAAAAB~&jid=&gjid=&cid=265574058.1642534102&tid=UA-63155060-4&_gid=1706477687.1655227210&gtm=2wg6d0PJLC7NW&z=953823851")
              .headers(headers_14),
            http("request_15")
              .get(uri10 + "/ekr/snippet.js?key=7b70f1ce-8a16-4be7-895f-45775342919a"),
            http("request_16")
              .get(uri16),
            http("request_17")
              .get(uri29),
            http("request_18")
              .get(uri24),
            http("request_19")
              .get(uri22),
            http("request_20")
              .get(uri31),
            http("request_21")
              .get(uri41 + "/104214.js")
              .headers(headers_21),
            http("request_22")
              .get(uri41 + "/generic/main/4.37.6/appcues.main.a313331000dcf82456d55510e872973eca683c39.js"),
            http("request_23")
              .get(uri10 + "/web_widget/latest/web-widget-framework-7e6e850c2ae905f5475f.js"),
            http("request_24")
              .get(uri41 + "/generic/main/4.37.6/container.a313331000dcf82456d55510e872973eca683c39.css"),
            http("request_25")
              .get(uri30 + "/images/login-3.jpg")
              .headers(headers_25),
            http("request_26")
              .get(uri13 + "/embeddable/config"),
            http("request_27")
              .get(uri35),
            http("request_28")
              .get(uri10 + "/web_widget/latest/classic/web-widget-classic-87a8c75.js"),
            http("request_29")
              .get(uri30 + "/images/favicon.png"),
            http("request_30")
              .get(uri10 + "/web_widget/latest/classic/web-widget-6090-87a8c75.js"),
            http("request_31")
              .get(uri10 + "/web_widget/latest/classic/web-widget-1062-87a8c75.js"),
            http("request_32")
              .get(uri10 + "/web_widget/latest/classic/web-widget-locales/classic/es-419-json-87a8c75.js"),
            http("request_33")
              .options(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=3a312b1bca354548b1653ebfcc8b3250&traceId=3a312b1bca354548b1653ebfcc8b3250&hubspotUtk=3469a92b54b28a6dc1fc923950d99be6&__hstc=12257387.3469a92b54b28a6dc1fc923950d99be6.1642534102743.1654110348130.1655227213121.54&__hssc=12257387.2.1655227213121&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F")
              .headers(headers_33),
            http("request_34")
              .get(uri10 + "/web_widget/latest/classic/web-widget-chat-sdk-87a8c75.js"),
            http("request_35")
              .get(uri04 + "?portalId=2960453")
              .headers(headers_35),
            http("request_36")
              .get(uri01 + "/en_US/fbevents.js"),
            http("request_37")
              .get(uri01 + "/signals/plugins/identity.js?v=2.9.62"),
            http("request_38")
              .get(uri01 + "/signals/config/473120943447503?v=2.9.62&r=stable"),
            http("request_39")
              .get(uri15 + "?k=1&sd=1440x900&cd=30-bit&cs=UTF-8&ln=es-419&bfp=2779873051&v=1.1&a=2960453&r=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&pu=https%3A%2F%2Fcor-staging-1.xyz%2Flogin&t=Login&cts=1655227981136&vi=3469a92b54b28a6dc1fc923950d99be6&nc=false&u=12257387.3469a92b54b28a6dc1fc923950d99be6.1642534102743.1654110348130.1655227213121.54&b=12257387.3.1655227213121&cc=15")
              .headers(headers_14),
            http("request_40")
              .get(uri07 + "/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=772&ck=0&ref=https://cor-staging-1.xyz/login&be=433&fe=759&dc=536&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1655227980372,%22n%22:0,%22u%22:338,%22ue%22:338,%22f%22:5,%22dn%22:5,%22dne%22:5,%22c%22:5,%22ce%22:5,%22rq%22:8,%22rp%22:313,%22rpe%22:532,%22dl%22:353,%22di%22:535,%22ds%22:535,%22de%22:536,%22dc%22:759,%22l%22:759,%22le%22:765%7D,%22navigation%22:%7B%22ty%22:1%7D%7D&fp=399&fcp=550&jsonp=NREUM.setToken")
              .headers(headers_40),
            http("request_41")
              .get(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=3a312b1bca354548b1653ebfcc8b3250&traceId=3a312b1bca354548b1653ebfcc8b3250&hubspotUtk=3469a92b54b28a6dc1fc923950d99be6&__hstc=12257387.3469a92b54b28a6dc1fc923950d99be6.1642534102743.1654110348130.1655227213121.54&__hssc=12257387.2.1655227213121&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F")
              .headers(headers_41),
            http("request_42")
              .get("/tr/?id=473120943447503&ev=PageView&dl=https%3A%2F%2Fcor-staging-1.xyz%2Flogin&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&if=false&ts=1655227981442&sw=1440&sh=900&ud[external_id]=3469a92b54b28a6dc1fc923950d99be6&v=2.9.62&r=stable&a=tmhubspot&ec=0&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227981424&coo=false&exp=p0&rqm=GET")
              .headers(headers_14),
            http("request_43")
              .get(uri13 + "/embeddable_blip?type=pageView&data=eyJjaGFubmVsIjoid2ViX3dpZGdldCIsInBhZ2VWaWV3Ijp7InRpbWUiOjAsImxvYWRUaW1lIjo4LjMwMDAwMDAxMTkyMDkyOSwibmF2aWdhdG9yTGFuZ3VhZ2UiOiJlcy00MTkiLCJwYWdlVGl0bGUiOiJMb2dpbiIsInVzZXJBZ2VudCI6Ik1vemlsbGEvNS4wIChNYWNpbnRvc2g7IEludGVsIE1hYyBPUyBYIDEwXzE1XzcpIEFwcGxlV2ViS2l0LzUzNy4zNiAoS0hUTUwsIGxpa2UgR2Vja28pIENocm9tZS8xMDIuMC41MDA1LjYxIFNhZmFyaS81MzcuMzYiLCJpc01vYmlsZSI6ZmFsc2UsImlzUmVzcG9uc2l2ZSI6dHJ1ZSwidmlld3BvcnRNZXRhIjoid2lkdGg9ZGV2aWNlLXdpZHRoLCBpbml0aWFsLXNjYWxlPTEsIG1heGltdW0tc2NhbGU9MSwgdXNlci1zY2FsYWJsZT1ubyIsImhlbHBDZW50ZXJEZWR1cCI6ZmFsc2UsInJlZmVycmVyIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6LyJ9LCJidWlkIjoiMTUyNWM4YTM4Y2Q5NGY3Mzk5Yjk3NjA1ZjU0ZTBhOGIiLCJzdWlkIjoiYTI3YzY5Mzk0ZmU0NDAzNmFmM2JmNjI2OTBlMmVkOTQiLCJ2ZXJzaW9uIjoiODdhOGM3NSIsInRpbWVzdGFtcCI6IjIwMjItMDYtMTRUMTc6MzM6MDEuMjM1WiIsInVybCI6Imh0dHBzOi8vY29yLXN0YWdpbmctMS54eXovbG9naW4ifQ==")
              .headers(headers_35),
            http("request_44")
              .get(uri10 + "/web_widget/latest/classic/web-widget-chat-incoming-message-notification-87a8c75.js"),
            http("request_45")
              .get(uri10 + "/web_widget/latest/classic/fda6cd35495c75f83508d9d2e77ee33d.mp3")
          )
      )
      .pause(1)
      .exec(
        http("request_46")
          .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fcor-staging-1.xyz%2Flogin&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&if=false&ts=1655227982950&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Login%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=3469a92b54b28a6dc1fc923950d99be6&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227981424&coo=false&es=automatic&tm=3&exp=p0&rqm=GET")
          .headers(headers_14)
          .resources(
            http("request_47")
              .get("/tr/?id=473120943447503&ev=SubscribedButtonClick&dl=https%3A%2F%2Fcor-staging-1.xyz%2Flogin&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&if=false&ts=1655227983811&cd[buttonFeatures]=%7B%22classList%22%3A%22ButtonLogin%22%2C%22destination%22%3A%22https%3A%2F%2Fcor-staging-1.xyz%2Flogin%22%2C%22id%22%3A%22container_login_principal%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22input%22%2C%22name%22%3A%22%22%2C%22value%22%3A%22Iniciar%20sesi%C3%B3n%22%7D&cd[buttonText]=Iniciar%20sesi%C3%B3n&cd[formFeatures]=%5B%7B%22id%22%3A%22%22%2C%22name%22%3A%22_token%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22hidden%22%7D%2C%7B%22id%22%3A%22email%22%2C%22name%22%3A%22email%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22text%22%7D%2C%7B%22id%22%3A%22checkbox-unmask%22%2C%22name%22%3A%22checkbox-unmask%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22checkbox%22%7D%2C%7B%22id%22%3A%22password%22%2C%22name%22%3A%22password%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22password%22%7D%2C%7B%22id%22%3A%22PersistentCookie%22%2C%22name%22%3A%22remember_me%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22checkbox%22%7D%2C%7B%22id%22%3A%22%22%2C%22name%22%3A%22intended%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22hidden%22%2C%22valueMeaning%22%3A%22empty%22%7D%5D&cd[pageFeatures]=%7B%22title%22%3A%22Login%22%7D&cd[parameters]=%5B%5D&sw=1440&sh=900&ud[external_id]=3469a92b54b28a6dc1fc923950d99be6&udff[em]=3f0fccb282509015bac65149a20d4ebc18e203bbef994a1825ec4a16ee995264&v=2.9.62&r=stable&a=tmhubspot&ec=2&o=2078&fbp=fb.1.1642534104092.1825265756&it=1655227981424&coo=false&es=automatic&tm=3&exp=p0&rqm=GET")
              .headers(headers_14),
            http("request_48")
              .get(uri26),
            http("request_49")
              .post(uri30 + "/login")
              .headers(headers_49)
              .formParam("_token", "QRBmDsxLAHUMsbCuOOCjUzuvdvZuqfGtEEnNiZZp")
              .formParam("email", "auto.cor@projectcor.com")
              .formParam("password", "CorrectPassword123!")
              .formParam("intended", ""),
            http("request_50")
              .get(uri18 + "/public/assets/css/compiled-task-dashboard.css?id=b9da4ab5211b33d6a741")
              .headers(headers_0),
            http("request_51")
              .get(uri20 + "/gtm.js?id=GTM-PJLC7NW")
              .headers(headers_0),
            http("request_52")
              .get(uri20 + "/gtm.js?id=GTM-PJLC7NW"),
            http("request_53")
              .get(uri19),
            http("request_54")
              .get(uri19)
              .headers(headers_0),
            http("request_55")
              .get(uri20 + "/gtag/js?id=G-WSQHTY6J1Z&l=dataLayer&cx=c"),
            http("request_56")
              .get(uri20 + "/gtag/js?id=G-WSQHTY6J1Z&l=dataLayer&cx=c")
              .headers(headers_0),
            http("request_57")
              .get(uri02 + "/analytics.js"),
            http("request_58")
              .get(uri02 + "/analytics.js")
              .headers(headers_0),
            http("request_59")
              .get(uri02 + "/collect?v=1&_v=j96&a=1517066182&t=pageview&_s=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&dr=https%3A%2F%2Fcor-staging-1.xyz%2F&ul=es-419&de=UTF-8&dt=COR%20%7C%20Hola%20Automation%20COR!&sd=30-bit&sr=1440x900&vp=1440x301&je=0&_u=QAEAAAAB~&jid=&gjid=&cid=265574058.1642534102&tid=UA-63155060-4&_gid=1393270933.1655145942&gtm=2wg6d0PJLC7NW&z=53739368")
              .headers(headers_59),
            http("request_60")
              .get(uri02 + "/collect?v=1&_v=j96&a=1517066182&t=pageview&_s=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&dr=https%3A%2F%2Fcor-staging-1.xyz%2F&ul=es-419&de=UTF-8&dt=COR%20%7C%20Hola%20Automation%20COR!&sd=30-bit&sr=1440x900&vp=1440x301&je=0&_u=QAEAAAAB~&jid=&gjid=&cid=265574058.1642534102&tid=UA-63155060-4&_gid=1393270933.1655145942&gtm=2wg6d0PJLC7NW&z=53739368")
              .headers(headers_0),
            http("request_61")
              .get(uri23 + "/images/logo-academy.svg"),
            http("request_62")
              .get(uri23 + "/images/logo-academy.svg")
              .headers(headers_0),
            http("request_63")
              .get(uri18 + "/public/assets/webfonts/fa-light-300.woff2")
              .headers(headers_63),
            http("request_64")
              .get(uri18 + "/public/assets/webfonts/fa-light-300.woff2"),
            http("request_65")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-300.woff2")
              .headers(headers_63),
            http("request_66")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-500.woff2")
              .headers(headers_63),
            http("request_67")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-regular.woff2")
              .headers(headers_63),
            http("request_68")
              .get(uri18 + "/public/assets/js/manifest.js?id=0757f573ad6efd8326e7"),
            http("request_69")
              .get(uri23 + "/images/no_user.png"),
            http("request_70")
              .get(uri23 + "/images/loading.svg"),
            http("request_71")
              .get(uri23 + "/images/no_user.png")
              .headers(headers_0),
            http("request_72")
              .get(uri23 + "/images/loading.svg")
              .headers(headers_0),
            http("request_73")
              .get(uri23 + "/images/noun_Party.svg"),
            http("request_74")
              .get(uri23 + "/images/noun_Party.svg")
              .headers(headers_0),
            http("request_75")
              .get(uri18 + "/public/assets/js/vendor~utils-1.js?id=b924129610e401a1afdc"),
            http("request_76")
              .get(uri18 + "/public/assets/js/manifest.js?id=0757f573ad6efd8326e7")
              .headers(headers_0),
            http("request_77")
              .get(uri18 + "/public/assets/js/vendor~utils-1.js?id=b924129610e401a1afdc")
              .headers(headers_0),
            http("request_78")
              .get(uri18 + "/public/assets/js/vendor~hours~modal.js?id=fba77b0c3e58265a2d0a"),
            http("request_79")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-500.woff2")
              .headers(headers_79),
            http("request_80")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-regular.woff2")
              .headers(headers_79),
            http("request_81")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-300.woff2")
              .headers(headers_79),
            http("request_82")
              .get(uri18 + "/public/assets/js/vendor~ui-1.js?id=c233ea4b6ef9257450b3"),
            http("request_83")
              .get(uri18 + "/public/assets/js/vendor~ui-2.js?id=34570b12ddb4ca9e3f09"),
            http("request_84")
              .get(uri18 + "/public/assets/js/vendor~hours~modal.js?id=fba77b0c3e58265a2d0a")
              .headers(headers_0),
            http("request_85")
              .get(uri18 + "/public/assets/js/vendor~ui-1.js?id=c233ea4b6ef9257450b3")
              .headers(headers_0),
            http("request_86")
              .get(uri18 + "/public/assets/js/vendor~commons.js?id=ddb94d4d67cdc9eb2426"),
            http("request_87")
              .get(uri18 + "/public/assets/js/compiled-taskDashboard.js?id=3ce639e77df41926d5d5"),
            http("request_88")
              .get(uri18 + "/public/assets/js/vendor~ui-2.js?id=34570b12ddb4ca9e3f09")
              .headers(headers_0),
            http("request_89")
              .get(uri18 + "/public/assets/js/compiled-global-notifications.js?id=7a8248d17573ad6c0020"),
            http("request_90")
              .get(uri18 + "/public/assets/js/compiled-hours-modal.js?id=f75c7e2d9afe2ab34f11"),
            http("request_91")
              .get(uri18 + "/public/assets/js/compiled-global-search.js?id=cce315cf302a7116cf51"),
            http("request_92")
              .get(uri18 + "/public/assets/js/compiled-site.js?id=e338b364c735026a389e"),
            http("request_93")
              .get(uri18 + "/public/assets/js/vendor~utils-2.js?id=dcf0fd47c98a3a3d00c8"),
            http("request_94")
              .get(uri18 + "/public/assets/js/compiled-global-notifications.js?id=7a8248d17573ad6c0020")
              .headers(headers_0),
            http("request_95")
              .get(uri18 + "/public/assets/js/compiled-taskDashboard.js?id=3ce639e77df41926d5d5")
              .headers(headers_0),
            http("request_96")
              .get(uri18 + "/public/assets/js/compiled-hours-modal.js?id=f75c7e2d9afe2ab34f11")
              .headers(headers_0),
            http("request_97")
              .get(uri18 + "/public/assets/js/vendor~utils-2.js?id=dcf0fd47c98a3a3d00c8")
              .headers(headers_0),
            http("request_98")
              .get(uri18 + "/public/assets/js/vendor~commons.js?id=ddb94d4d67cdc9eb2426")
              .headers(headers_0),
            http("request_99")
              .get(uri18 + "/public/assets/js/compiled-site.js?id=e338b364c735026a389e")
              .headers(headers_0),
            http("request_100")
              .get(uri18 + "/public/assets/js/compiled-global-components-react.js?id=8bf44c29a12a0cb95e9d")
              .headers(headers_0),
            http("request_101")
              .get(uri18 + "/public/assets/js/bulk-actions.js?id=ea52a44fd768ee833b8c")
              .headers(headers_0),
            http("request_102")
              .get(uri18 + "/public/assets/js/compiled-global-search.js?id=cce315cf302a7116cf51")
              .headers(headers_0),
            http("request_103")
              .get(uri18 + "/public/assets/js/compiled-tasksDashboardApp.js?id=d51f6c6bb3b12e04f916")
              .headers(headers_0),
            http("request_104")
              .get(uri18 + "/public/assets/js/bulk-actions.js?id=ea52a44fd768ee833b8c"),
            http("request_105")
              .get(uri18 + "/public/assets/js/compiled-global-components-react.js?id=8bf44c29a12a0cb95e9d"),
            http("request_106")
              .get(uri18 + "/public/assets/js/new-panel.js?id=ee9d8b5d4d8bb7b8dfec"),
            http("request_107")
              .get(uri18 + "/public/assets/js/compiled-tasksDashboardApp.js?id=d51f6c6bb3b12e04f916"),
            http("request_108")
              .get(uri18 + "/public/assets/js/new-panel.js?id=ee9d8b5d4d8bb7b8dfec")
              .headers(headers_0),
            http("request_109")
              .get(uri23 + "/")
              .headers(headers_109),
            http("request_110")
              .post(uri40 + "/")
              .headers(headers_110)
              .formParam("client", "1c6ee3dbaa2efe8638ed8989b115b84a")
              .formParam("e", "[{\"device_id\":\"05b6fe91-1988-4594-b77b-44eae330f47cR\",\"user_id\":null,\"timestamp\":1655227985327,\"event_id\":2992,\"session_id\":1655227010120,\"event_type\":\"$identify\",\"version_name\":null,\"platform\":\"Web\",\"os_name\":\"Chrome\",\"os_version\":\"102\",\"device_model\":\"Mac\",\"language\":\"es-419\",\"api_properties\":{},\"event_properties\":{},\"user_properties\":{\"$set\":{\"nombre\":\"Automation COR\",\"apellido\":\"Automation COR\",\"user_id\":33810,\"email\":\"auto.cor@projectcor.com\",\"company\":\"Tu Empresa\",\"role\":\"C-Level\",\"user_type\":\"internal\"}},\"uuid\":\"2845fe58-a15b-4e28-b4ff-36ccf8fd9a0a\",\"library\":{\"name\":\"amplitude-js\",\"version\":\"3.4.1\"},\"sequence_number\":4160,\"groups\":{},\"user_agent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36\"}]")
              .formParam("v", "2")
              .formParam("upload_time", "1655227985328")
              .formParam("checksum", "aa53c99669d273d9a4e7ec1337e4b504"),
            http("request_111")
              .get(uri18 + "/images/prev.png"),
            http("request_112")
              .get(uri18 + "/images/next.png"),
            http("request_113")
              .get(uri18 + "/images/loading.gif"),
            http("request_114")
              .get(uri18 + "/images/prev.png")
              .headers(headers_0),
            http("request_115")
              .get(uri18 + "/images/next.png")
              .headers(headers_0),
            http("request_116")
              .get(uri18 + "/images/loading.gif")
              .headers(headers_0),
            http("request_117")
              .get(uri18 + "/images/close.png"),
            http("request_118")
              .get(uri18 + "/images/close.png")
              .headers(headers_0),
            http("request_119")
              .get(uri39 + "/300x300/user.png")
              .headers(headers_0),
            http("request_120")
              .get(uri39 + "/300x300/user.png"),
            http("request_121")
              .get(uri10 + "/ekr/snippet.js?key=7b70f1ce-8a16-4be7-895f-45775342919a")
              .headers(headers_0),
            http("request_122")
              .get(uri10 + "/ekr/snippet.js?key=7b70f1ce-8a16-4be7-895f-45775342919a"),
            http("request_123")
              .get(uri41 + "/104214.js")
              .headers(headers_0),
            http("request_124")
              .get(uri41 + "/104214.js"),
            http("request_125")
              .get(uri23 + "/tracking/counters/timer?t1=1655227986242")
              .headers(headers_125),
            http("request_126")
              .get(uri23 + "/tracking/counters/timer?t1=1655227986242")
              .headers(headers_126),
            http("request_127")
              .get(uri41 + "/generic/main/4.37.6/appcues.main.a313331000dcf82456d55510e872973eca683c39.js"),
            http("request_128")
              .get(uri41 + "/generic/main/4.37.6/appcues.main.a313331000dcf82456d55510e872973eca683c39.js")
              .headers(headers_63),
            http("request_129")
              .get(uri31)
              .headers(headers_79),
            http("request_130")
              .get(uri31)
              .headers(headers_0),
            http("request_131")
              .options(uri14)
              .headers(headers_131),
            http("request_132")
              .get(uri41 + "/generic/main/4.37.6/container.a313331000dcf82456d55510e872973eca683c39.css"),
            http("request_133")
              .get(uri41 + "/generic/main/4.37.6/container.a313331000dcf82456d55510e872973eca683c39.css")
              .headers(headers_63),
            http("request_134")
              .get(uri35),
            http("request_135")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_136")
              .get(uri35)
              .headers(headers_0),
            http("request_137")
              .get(uri25 + "/v2/tasks?filters=%7B%22taskType%22%3A%22i_am_collaborator%22%2C%22archived%22%3A2%7D&page=1&order=%7B%22client%22%3A%22-ALL-%22%2C%22project%22%3A%22-ALL-%22%2C%22task%22%3A%22-ALL-%22%2C%22deadline%22%3A%22DESC%22%2C%22PM%22%3A%22-ALL-%22%2C%22priority%22%3A%22-ALL-%22%7D")
              .headers(headers_137),
            http("request_138")
              .get(uri25 + "/v2/tasks?filters=%7B%22taskType%22%3A%22i_am_collaborator%22%2C%22archived%22%3A2%7D&page=1&order=%7B%22client%22%3A%22-ALL-%22%2C%22project%22%3A%22-ALL-%22%2C%22task%22%3A%22-ALL-%22%2C%22deadline%22%3A%22DESC%22%2C%22PM%22%3A%22-ALL-%22%2C%22priority%22%3A%22-ALL-%22%7D")
              .headers(headers_138),
            http("request_139")
              .get(uri25 + "/v1/settings/get-charging-periods")
              .headers(headers_137),
            http("request_140")
              .get(uri25 + "/v1/settings/get-charging-periods")
              .headers(headers_138),
            http("request_141")
              .get(uri25 + "/v1/eventLogs/lasts/projects")
              .headers(headers_138),
            http("request_142")
              .get(uri25 + "/v2/tasks/total?filters=%7B%22taskType%22%3A%22i_am_collaborator%22%2C%22archived%22%3A2%7D")
              .headers(headers_138),
            http("request_143")
              .get(uri25 + "/v1/eventLogs/lasts/projects")
              .headers(headers_137),
            http("request_144")
              .get(uri25 + "/v2/tasks/total?filters=%7B%22taskType%22%3A%22i_am_collaborator%22%2C%22archived%22%3A2%7D")
              .headers(headers_137),
            http("request_145")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_146")
              .options(uri14)
              .headers(headers_131),
            http("request_147")
              .get(uri23 + "/images/defs.svg")
              .headers(headers_0),
            http("request_148")
              .get(uri10 + "/web_widget/latest/web-widget-framework-7e6e850c2ae905f5475f.js"),
            http("request_149")
              .get(uri23 + "/images/defs.svg"),
            http("request_150")
              .get(uri13 + "/embeddable/config")
              .headers(headers_79),
            http("request_151")
              .get(uri10 + "/web_widget/latest/classic/web-widget-classic-87a8c75.js"),
            http("request_152")
              .get(uri10 + "/web_widget/latest/classic/web-widget-1062-87a8c75.js"),
            http("request_153")
              .get(uri10 + "/web_widget/latest/classic/web-widget-6090-87a8c75.js"),
            http("request_154")
              .get(uri10 + "/web_widget/latest/classic/web-widget-locales/classic/es-419-json-87a8c75.js"),
            http("request_155")
              .get(uri10 + "/web_widget/latest/classic/web-widget-locales/classic/es-json-87a8c75.js"),
            http("request_156")
              .get(uri10 + "/web_widget/latest/classic/web-widget-chat-sdk-87a8c75.js"),
            http("request_157")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0157_request.json")),
            http("request_158")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0158_request.json")),
            http("request_159")
              .get(uri07 + "/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=2810&ck=0&ref=https://demo-sp.cor-staging-1.xyz/&be=1495&fe=2768&dc=2539&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1655227983817,%22n%22:0,%22f%22:1046,%22dn%22:1046,%22dne%22:1046,%22c%22:1046,%22ce%22:1046,%22rq%22:1046,%22rp%22:1386,%22rpe%22:2165,%22dl%22:1428,%22di%22:2539,%22ds%22:2539,%22de%22:2632,%22dc%22:2767,%22l%22:2767,%22le%22:2770%7D,%22navigation%22:%7B%7D%7D&fp=1465&fcp=1891&jsonp=NREUM.setToken")
              .headers(headers_159),
            http("request_160")
              .get(uri07 + "/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=2810&ck=0&ref=https://demo-sp.cor-staging-1.xyz/&be=1495&fe=2768&dc=2539&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1655227983817,%22n%22:0,%22f%22:1046,%22dn%22:1046,%22dne%22:1046,%22c%22:1046,%22ce%22:1046,%22rq%22:1046,%22rp%22:1386,%22rpe%22:2165,%22dl%22:1428,%22di%22:2539,%22ds%22:2539,%22de%22:2632,%22dc%22:2767,%22l%22:2767,%22le%22:2770%7D,%22navigation%22:%7B%7D%7D&fp=1465&fcp=1891&jsonp=NREUM.setToken")
              .headers(headers_0),
            http("request_161")
              .get(uri14)
              .headers(headers_161),
            http("request_162")
              .get(uri14)
              .headers(headers_162),
            http("request_163")
              .get(uri13 + "/embeddable_identify?type=user&data=eyJ1c2VyIjp7ImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20iLCJuYW1lIjoiQXV0b21hdGlvbiBDT1IgQXV0b21hdGlvbiBDT1IiLCJvcmdhbml6YXRpb24iOiJUdSBFbXByZXNhIiwibG9jYWxlSWQiOjExOTR9LCJ1c2VyQWdlbnQiOiJNb3ppbGxhLzUuMCAoTWFjaW50b3NoOyBJbnRlbCBNYWMgT1MgWCAxMF8xNV83KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvMTAyLjAuNTAwNS42MSBTYWZhcmkvNTM3LjM2IiwiYnVpZCI6ImNiOGRlNzc4NTdhYjRmMmNiY2EzYzA4MDlmODc1Njk5Iiwic3VpZCI6ImU2ZWRkMWI0ZDFhODQ5NDE4NWU3MjBlZTZlNWYyYzk0IiwidmVyc2lvbiI6Ijg3YThjNzUiLCJ0aW1lc3RhbXAiOiIyMDIyLTA2LTE0VDE3OjMzOjA2LjgxNVoiLCJ1cmwiOiJodHRwczovL2RlbW8tc3AuY29yLXN0YWdpbmctMS54eXovPyZhcmNoaXZlZD0yJnRhc2tUeXBlPWlfYW1fY29sbGFib3JhdG9yIn0%3D")
              .headers(headers_79),
            http("request_164")
              .get(uri25 + "/v1/users?page=false")
              .headers(headers_137),
            http("request_165")
              .get(uri25 + "/v1/users?page=false")
              .headers(headers_138),
            http("request_166")
              .get(uri13 + "/embeddable_blip?type=pageView&data=eyJjaGFubmVsIjoid2ViX3dpZGdldCIsInBhZ2VWaWV3Ijp7InRpbWUiOjAsImxvYWRUaW1lIjo2LjUsIm5hdmlnYXRvckxhbmd1YWdlIjoiZXMtNDE5IiwicGFnZVRpdGxlIjoiQ09SIHwgSG9sYSBBdXRvbWF0aW9uIENPUiEiLCJ1c2VyQWdlbnQiOiJNb3ppbGxhLzUuMCAoTWFjaW50b3NoOyBJbnRlbCBNYWMgT1MgWCAxMF8xNV83KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvMTAyLjAuNTAwNS42MSBTYWZhcmkvNTM3LjM2IiwiaXNNb2JpbGUiOmZhbHNlLCJpc1Jlc3BvbnNpdmUiOnRydWUsInZpZXdwb3J0TWV0YSI6IndpZHRoPWRldmljZS13aWR0aCwgaW5pdGlhbC1zY2FsZT0xLCBtYXhpbXVtLXNjYWxlPTEsIHVzZXItc2NhbGFibGU9bm8iLCJoZWxwQ2VudGVyRGVkdXAiOmZhbHNlLCJyZWZlcnJlciI6Imh0dHBzOi8vY29yLXN0YWdpbmctMS54eXovIn0sImJ1aWQiOiJjYjhkZTc3ODU3YWI0ZjJjYmNhM2MwODA5Zjg3NTY5OSIsInN1aWQiOiJlNmVkZDFiNGQxYTg0OTQxODVlNzIwZWU2ZTVmMmM5NCIsInZlcnNpb24iOiI4N2E4Yzc1IiwidGltZXN0YW1wIjoiMjAyMi0wNi0xNFQxNzozMzowNi44MzlaIiwidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6Lz8mYXJjaGl2ZWQ9MiZ0YXNrVHlwZT1pX2FtX2NvbGxhYm9yYXRvciJ9")
              .headers(headers_79),
            http("request_167")
              .get(uri23 + "/public/zendesk_jwt")
              .headers(headers_167),
            http("request_168")
              .get(uri23 + "/public/zendesk_jwt")
              .headers(headers_0),
            http("request_169")
              .get(uri14)
              .headers(headers_161),
            http("request_170")
              .get(uri14)
              .headers(headers_162),
            http("request_171")
              .post(uri27)
              .headers(headers_79)
              .formParam("account_key", "MgPNdChCq7VHPMpwrDzUJG461CZpWilS")
              .formParam("format", "json")
              .formParam("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiQXV0b21hdGlvbiBDT1IgQXV0b21hdGlvbiBDT1IiLCJlbWFpbCI6ImF1dG8uY29yQHByb2plY3Rjb3IuY29tIiwiaWF0IjoxNjU1MjI3OTg3LCJleHRlcm5hbF9pZCI6IjMzODEwIiwidV9pZCI6IjMzODEwIiwib3JnYW5pemF0aW9uIjoiVHUgRW1wcmVzYSIsInVfcm9sX2lkIjoiMSIsInVfaWRfZGVfZW1wcmVzYSI6IjcxOCIsInVfcG9zaWNpb24iOiJObyBwb3NpdGlvbiIsInVfdWx0aW1vX2xvZ3VlbyI6IjIwMjItMDYtMTQgMDU6MzM6MDUifQ.VDSVH8Y7bq2LBhl2bzdJOxTIZ8YCd91jOrsJRI83qoE"),
            http("request_172")
              .get(uri18 + "/public/assets/webfonts/fa-regular-400.woff2")
              .headers(headers_63),
            http("request_173")
              .get(uri18 + "/public/assets/webfonts/fa-regular-400.woff2")
          )
      )
      .pause(1)
      .exec(
        http("request_174")
          .get(uri10 + "/web_widget/latest/classic/web-widget-chat-incoming-message-notification-87a8c75.js")
          .resources(
            http("request_175")
              .get(uri10 + "/web_widget/latest/classic/fda6cd35495c75f83508d9d2e77ee33d.mp3"),
            http("request_176")
              .get(uri26)
              .headers(headers_0),
            http("request_177")
              .get(uri26),
            http("request_178")
              .post(uri02 + "/g/collect?v=2&tid=G-WSQHTY6J1Z&gtm=2oe6d0&_p=1517066182&_z=ccd.vdB&cid=265574058.1642534102&ul=es-419&sr=1440x900&sid=1655227010&sct=334&seg=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F&dr=https%3A%2F%2Fcor-staging-1.xyz%2F&dt=COR%20%7C%20Hola%20Automation%20COR!&_s=1")
              .headers(headers_178)
              .body(RawFileBody("recordedsimulation/0178_request.txt")),
            http("request_179")
              .get(uri25 + "/v1/counter/days")
              .headers(headers_138),
            http("request_180")
              .get(uri25 + "/v1/counter/days")
              .headers(headers_137),
            http("request_181")
              .get(uri06)
              .headers(headers_0),
            http("request_182")
              .get(uri06),
            http("request_183")
              .get(uri33 + "?sv=6")
              .headers(headers_183),
            http("request_184")
              .get(uri33 + "?sv=6")
              .headers(headers_0),
            http("request_185")
              .get(uri37)
              .headers(headers_0),
            http("request_186")
              .get(uri37),
            http("request_187")
              .get(uri05),
            http("request_188")
              .get(uri17)
              .headers(headers_183),
            http("request_189")
              .get(uri17)
              .headers(headers_0),
            http("request_190")
              .get(uri16),
            http("request_191")
              .get(uri24),
            http("request_192")
              .get(uri22),
            http("request_193")
              .get(uri16)
              .headers(headers_0),
            http("request_194")
              .get(uri24)
              .headers(headers_0),
            http("request_195")
              .get(uri29),
            http("request_196")
              .get(uri29)
              .headers(headers_0),
            http("request_197")
              .get(uri22)
              .headers(headers_0),
            http("request_198")
              .get(uri04 + "?portalId=2960453")
              .headers(headers_79),
            http("request_199")
              .get(uri04 + "?portalId=2960453")
              .headers(headers_0),
            http("request_200")
              .get(uri01 + "/en_US/fbevents.js"),
            http("request_201")
              .get(uri01 + "/en_US/fbevents.js")
              .headers(headers_0),
            http("request_202")
              .get(uri01 + "/signals/plugins/identity.js?v=2.9.62"),
            http("request_203")
              .get(uri01 + "/signals/plugins/identity.js?v=2.9.62")
              .headers(headers_0),
            http("request_204")
              .get(uri01 + "/signals/config/473120943447503?v=2.9.62&r=stable"),
            http("request_205")
              .get(uri01 + "/signals/config/473120943447503?v=2.9.62&r=stable")
              .headers(headers_0),
            http("request_206")
              .options(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=20c55d123a014ca4be886de527ff0999&traceId=20c55d123a014ca4be886de527ff0999&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.2.1655227017385&referrer=https%3A%2F%2Fcor-staging-1.xyz%2F")
              .headers(headers_206),
            http("request_207")
              .get(uri15 + "?k=1&sd=1440x900&cd=30-bit&cs=UTF-8&ln=es-419&bfp=2779873051&v=1.1&a=2960453&r=https%3A%2F%2Fcor-staging-1.xyz%2F&pu=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&t=(3)+COR+%7C+Hola+Automation+COR!&cts=1655227991878&vi=495905ffa1314565844202a2ec0f0171&nc=false&u=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&b=12257387.3.1655227017385&cc=15")
              .headers(headers_0),
            http("request_208")
              .get(uri15 + "?k=1&sd=1440x900&cd=30-bit&cs=UTF-8&ln=es-419&bfp=2779873051&v=1.1&a=2960453&r=https%3A%2F%2Fcor-staging-1.xyz%2F&pu=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&t=(3)+COR+%7C+Hola+Automation+COR!&cts=1655227991878&vi=495905ffa1314565844202a2ec0f0171&nc=false&u=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&b=12257387.3.1655227017385&cc=15")
              .headers(headers_59),
            http("request_209")
              .get("/tr/?id=473120943447503&ev=PageView&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&rl=https%3A%2F%2Fcor-staging-1.xyz%2F&if=false&ts=1655227992138&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=0&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227992114&coo=false&exp=p1&rqm=GET")
              .headers(headers_59),
            http("request_210")
              .get("/tr/?id=473120943447503&ev=PageView&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&rl=https%3A%2F%2Fcor-staging-1.xyz%2F&if=false&ts=1655227992138&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=0&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227992114&coo=false&exp=p1&rqm=GET")
              .headers(headers_0),
            http("request_211")
              .get(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=20c55d123a014ca4be886de527ff0999&traceId=20c55d123a014ca4be886de527ff0999&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.2.1655227017385&referrer=https%3A%2F%2Fcor-staging-1.xyz%2F")
              .headers(headers_211),
            http("request_212")
              .get(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=20c55d123a014ca4be886de527ff0999&traceId=20c55d123a014ca4be886de527ff0999&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.2.1655227017385&referrer=https%3A%2F%2Fcor-staging-1.xyz%2F")
              .headers(headers_212)
          )
      )
      .pause(1)
      .exec(
        http("request_213")
          .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&rl=https%3A%2F%2Fcor-staging-1.xyz%2F&if=false&ts=1655227993641&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22(3)%20COR%20%7C%20Hola%20Automation%20COR!%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227992114&coo=false&es=automatic&tm=3&exp=p1&rqm=GET")
          .headers(headers_0)
          .resources(
            http("request_214")
              .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&rl=https%3A%2F%2Fcor-staging-1.xyz%2F&if=false&ts=1655227993641&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22(3)%20COR%20%7C%20Hola%20Automation%20COR!%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227992114&coo=false&es=automatic&tm=3&exp=p1&rqm=GET")
              .headers(headers_59),
            http("request_215")
              .get(uri08)
              .headers(headers_0),
            http("request_216")
              .get(uri12),
            http("request_217")
              .get(uri08),
            http("request_218")
              .get(uri12)
              .headers(headers_0),
            http("request_219")
              .options(uri32)
              .headers(headers_219),
            http("request_220")
              .post(uri32)
              .headers(headers_220)
              .body(RawFileBody("recordedsimulation/0220_request.txt")),
            http("request_221")
              .get(uri09 + "?api_key=6638bcf83ce2474c9f1b6968d86252a76c64c5f974a04380a47426e4ce29cf731e25212dcbfc4af0b390cb698ebb311e068bb391f60745f4b836e75dc2cfa45120f00fdd35454ac8a1a5954576a9d7aa4f699458e3744f2883ea5b513ccd76499a6bf37801d945c19aa5cff88e78b902&data=eyJpZGVudGl0eSI6eyJvcmdhbml6YXRpb24iOnsiaWQiOjcxOCwibmFtZSI6IlR1IEVtcHJlc2EifSwidXNlciI6eyJpZCI6MzM4MTAsIm5hbWUiOiJBdXRvbWF0aW9uIENPUiBBdXRvbWF0aW9uIENPUiIsImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20ifX0sImJyb3dzZXIiOnsidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6Lz8mYXJjaGl2ZWQ9MiZ0YXNrVHlwZT1pX2FtX2NvbGxhYm9yYXRvciIsInVzZXJBZ2VudCI6Ik1vemlsbGE1ME1hY2ludG9zaEludGVsTWFjT1NYMTAxNTdBcHBsZVdlYktpdDUzNzM2S0hUTUxsaWtlR2Vja29DaHJvbWUxMDIwNTAwNTYxU2FmYXJpNTM3MzYiLCJzY3JlZW5XaWR0aCI6MTQ0MCwic2NyZWVuSGVpZ2h0Ijo5MDB9LCJ2YWx1ZSI6MX0%3D&modified=1655227994626&jsonp=keenJSONPCallback1655227994626")
              .headers(headers_0),
            http("request_222")
              .options(uri03)
              .headers(headers_222),
            http("request_223")
              .get(uri09 + "?api_key=6638bcf83ce2474c9f1b6968d86252a76c64c5f974a04380a47426e4ce29cf731e25212dcbfc4af0b390cb698ebb311e068bb391f60745f4b836e75dc2cfa45120f00fdd35454ac8a1a5954576a9d7aa4f699458e3744f2883ea5b513ccd76499a6bf37801d945c19aa5cff88e78b902&data=eyJpZGVudGl0eSI6eyJvcmdhbml6YXRpb24iOnsiaWQiOjcxOCwibmFtZSI6IlR1IEVtcHJlc2EifSwidXNlciI6eyJpZCI6MzM4MTAsIm5hbWUiOiJBdXRvbWF0aW9uIENPUiBBdXRvbWF0aW9uIENPUiIsImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20ifX0sImJyb3dzZXIiOnsidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6Lz8mYXJjaGl2ZWQ9MiZ0YXNrVHlwZT1pX2FtX2NvbGxhYm9yYXRvciIsInVzZXJBZ2VudCI6Ik1vemlsbGE1ME1hY2ludG9zaEludGVsTWFjT1NYMTAxNTdBcHBsZVdlYktpdDUzNzM2S0hUTUxsaWtlR2Vja29DaHJvbWUxMDIwNTAwNTYxU2FmYXJpNTM3MzYiLCJzY3JlZW5XaWR0aCI6MTQ0MCwic2NyZWVuSGVpZ2h0Ijo5MDB9LCJ2YWx1ZSI6MX0%3D&modified=1655227994626&jsonp=keenJSONPCallback1655227994626")
              .headers(headers_183),
            http("request_224")
              .post(uri03)
              .headers(headers_224)
              .body(RawFileBody("recordedsimulation/0224_request.json")),
            http("request_225")
              .get("/tr/?id=473120943447503&ev=SubscribedButtonClick&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&rl=https%3A%2F%2Fcor-staging-1.xyz%2F&if=false&ts=1655227996308&cd[buttonFeatures]=%7B%22classList%22%3A%22SideBar__anchor%22%2C%22destination%22%3A%22https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%22%2C%22id%22%3A%22%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22Proyectos%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22a%22%2C%22name%22%3A%22%22%7D&cd[buttonText]=Proyectos&cd[formFeatures]=%5B%5D&cd[pageFeatures]=%7B%22title%22%3A%22(3)%20COR%20%7C%20Hola%20Automation%20COR!%22%7D&cd[parameters]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=2&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227992114&coo=false&es=automatic&tm=3&exp=p1&rqm=GET")
              .headers(headers_59),
            http("request_226")
              .get("/tr/?id=473120943447503&ev=SubscribedButtonClick&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&rl=https%3A%2F%2Fcor-staging-1.xyz%2F&if=false&ts=1655227996308&cd[buttonFeatures]=%7B%22classList%22%3A%22SideBar__anchor%22%2C%22destination%22%3A%22https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%22%2C%22id%22%3A%22%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22Proyectos%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22a%22%2C%22name%22%3A%22%22%7D&cd[buttonText]=Proyectos&cd[formFeatures]=%5B%5D&cd[pageFeatures]=%7B%22title%22%3A%22(3)%20COR%20%7C%20Hola%20Automation%20COR!%22%7D&cd[parameters]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=2&o=30&fbp=fb.1.1642534104092.1825265756&it=1655227992114&coo=false&es=automatic&tm=3&exp=p1&rqm=GET")
              .headers(headers_0),
            http("request_227")
              .get(uri18 + "/public/assets/css/compiled-site.css?id=84be8cd57be03e8b5b2e")
              .headers(headers_0),
            http("request_228")
              .get(uri18 + "/public/assets/css/compiled-list-projects.css?id=fc391a816cd593560bbd")
              .headers(headers_0),
            http("request_229")
              .get(uri18 + "/public/assets/css/compiled-site.css?id=84be8cd57be03e8b5b2e"),
            http("request_230")
              .get(uri18 + "/public/assets/css/compiled-list-projects.css?id=fc391a816cd593560bbd"),
            http("request_231")
              .get(uri20 + "/gtm.js?id=GTM-PJLC7NW"),
            http("request_232")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-300.woff2")
              .headers(headers_63),
            http("request_233")
              .get(uri20 + "/gtm.js?id=GTM-PJLC7NW")
              .headers(headers_0),
            http("request_234")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-regular.woff2")
              .headers(headers_63),
            http("request_235")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-500.woff2")
              .headers(headers_63),
            http("request_236")
              .get(uri18 + "/public/assets/webfonts/fa-light-300.woff2")
              .headers(headers_63),
            http("request_237")
              .get(uri18 + "/public/assets/webfonts/fa-regular-400.woff2")
              .headers(headers_63),
            http("request_238")
              .get(uri19),
            http("request_239")
              .get(uri19)
              .headers(headers_0),
            http("request_240")
              .get(uri20 + "/gtag/js?id=G-WSQHTY6J1Z&l=dataLayer&cx=c"),
            http("request_241")
              .get(uri02 + "/analytics.js"),
            http("request_242")
              .get(uri20 + "/gtag/js?id=G-WSQHTY6J1Z&l=dataLayer&cx=c")
              .headers(headers_0),
            http("request_243")
              .get(uri02 + "/analytics.js")
              .headers(headers_0),
            http("request_244")
              .get(uri02 + "/collect?v=1&_v=j96&a=351868848&t=pageview&_s=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects&ul=es-419&de=UTF-8&dt=COR%20%7C%20Proyectos&sd=30-bit&sr=1440x900&vp=1440x472&je=0&_u=QAEAAAAB~&jid=&gjid=&cid=265574058.1642534102&tid=UA-63155060-4&_gid=1393270933.1655145942&gtm=2wg6d0PJLC7NW&z=18857264")
              .headers(headers_0),
            http("request_245")
              .get(uri02 + "/collect?v=1&_v=j96&a=351868848&t=pageview&_s=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects&ul=es-419&de=UTF-8&dt=COR%20%7C%20Proyectos&sd=30-bit&sr=1440x900&vp=1440x472&je=0&_u=QAEAAAAB~&jid=&gjid=&cid=265574058.1642534102&tid=UA-63155060-4&_gid=1393270933.1655145942&gtm=2wg6d0PJLC7NW&z=18857264")
              .headers(headers_59),
            http("request_246")
              .post(uri40 + "/")
              .headers(headers_110)
              .formParam("client", "1c6ee3dbaa2efe8638ed8989b115b84a")
              .formParam("e", "[{\"device_id\":\"05b6fe91-1988-4594-b77b-44eae330f47cR\",\"user_id\":null,\"timestamp\":1655227996868,\"event_id\":2993,\"session_id\":1655227010120,\"event_type\":\"$identify\",\"version_name\":null,\"platform\":\"Web\",\"os_name\":\"Chrome\",\"os_version\":\"102\",\"device_model\":\"Mac\",\"language\":\"es-419\",\"api_properties\":{},\"event_properties\":{},\"user_properties\":{\"$set\":{\"nombre\":\"Automation COR\",\"apellido\":\"Automation COR\",\"user_id\":33810,\"email\":\"auto.cor@projectcor.com\",\"company\":\"Tu Empresa\",\"role\":\"C-Level\",\"user_type\":\"internal\"}},\"uuid\":\"57c07b4a-f7fa-477e-9ddb-0dade35bdcf6\",\"library\":{\"name\":\"amplitude-js\",\"version\":\"3.4.1\"},\"sequence_number\":4161,\"groups\":{},\"user_agent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36\"}]")
              .formParam("v", "2")
              .formParam("upload_time", "1655227996869")
              .formParam("checksum", "c8696c958667a6f50b6db982a0505e41"),
            http("request_247")
              .get(uri23 + "/images/logo-academy.svg")
              .headers(headers_0),
            http("request_248")
              .get(uri18 + "/public/assets/js/compiled-collapsible-cor-academy.js?id=be59d1fe2f02b64b15dc")
              .headers(headers_0),
            http("request_249")
              .get(uri18 + "/public/assets/js/compiled-collapsible-cor-academy.js?id=be59d1fe2f02b64b15dc"),
            http("request_250")
              .get(uri18 + "/images/plus-light.svg")
              .headers(headers_0),
            http("request_251")
              .get(uri18 + "/images/plus-light.svg"),
            http("request_252")
              .get(uri23 + "/images/noun_Party.svg")
              .headers(headers_0),
            http("request_253")
              .get(uri18 + "/public/assets/js/manifest.js?id=0757f573ad6efd8326e7")
              .headers(headers_0),
            http("request_254")
              .get(uri18 + "/public/assets/js/vendor~utils-1.js?id=b924129610e401a1afdc")
              .headers(headers_0),
            http("request_255")
              .get(uri23 + "/projects")
              .headers(headers_255),
            http("request_256")
              .get(uri23 + "/projects")
              .headers(headers_256),
            http("request_257")
              .get(uri18 + "/public/assets/js/vendor~utils-2.js?id=dcf0fd47c98a3a3d00c8")
              .headers(headers_0),
            http("request_258")
              .get(uri18 + "/public/assets/js/vendor~commons.js?id=ddb94d4d67cdc9eb2426")
              .headers(headers_0),
            http("request_259")
              .get(uri18 + "/public/assets/js/vendor~hours~modal.js?id=fba77b0c3e58265a2d0a")
              .headers(headers_0),
            http("request_260")
              .get(uri18 + "/public/assets/js/vendor~ui-1.js?id=c233ea4b6ef9257450b3")
              .headers(headers_0),
            http("request_261")
              .get(uri18 + "/public/assets/js/vendor~ui-2.js?id=34570b12ddb4ca9e3f09")
              .headers(headers_0),
            http("request_262")
              .get(uri18 + "/public/assets/js/compiled-site.js?id=e338b364c735026a389e")
              .headers(headers_0),
            http("request_263")
              .get(uri18 + "/public/assets/js/new-panel.js?id=ee9d8b5d4d8bb7b8dfec")
              .headers(headers_0),
            http("request_264")
              .get(uri18 + "/public/assets/js/compiled-global-components-react.js?id=8bf44c29a12a0cb95e9d")
              .headers(headers_0),
            http("request_265")
              .get(uri18 + "/public/assets/js/bulk-actions.js?id=ea52a44fd768ee833b8c")
              .headers(headers_0),
            http("request_266")
              .get(uri18 + "/public/assets/js/compiled-global-search.js?id=cce315cf302a7116cf51")
              .headers(headers_0),
            http("request_267")
              .get(uri18 + "/public/assets/js/compiled-global-notifications.js?id=7a8248d17573ad6c0020")
              .headers(headers_0),
            http("request_268")
              .get(uri18 + "/public/assets/js/compiled-hours-modal.js?id=f75c7e2d9afe2ab34f11")
              .headers(headers_0),
            http("request_269")
              .get(uri18 + "/public/assets/js/compiled-new-task-dashboard.js?id=7f7bfbfef4207f283f4c")
              .headers(headers_0),
            http("request_270")
              .get(uri18 + "/public/assets/js/compiled-list-projects.js?id=8804a846c182a9e23c00")
              .headers(headers_0),
            http("request_271")
              .get(uri18 + "/public/assets/js/compiled-list-projects.js?id=8804a846c182a9e23c00"),
            http("request_272")
              .get(uri18 + "/public/assets/js/compiled-new-task-dashboard.js?id=7f7bfbfef4207f283f4c"),
            http("request_273")
              .get(uri28)
              .headers(headers_0),
            http("request_274")
              .get(uri28),
            http("request_275")
              .get(uri23 + "/images/loading.svg")
              .headers(headers_0),
            http("request_276")
              .get(uri39 + "/300x300/user.png")
              .headers(headers_0),
            http("request_277")
              .get(uri10 + "/ekr/snippet.js?key=7b70f1ce-8a16-4be7-895f-45775342919a")
              .headers(headers_0),
            http("request_278")
              .get(uri10 + "/ekr/snippet.js?key=7b70f1ce-8a16-4be7-895f-45775342919a"),
            http("request_279")
              .get(uri35),
            http("request_280")
              .get(uri35)
              .headers(headers_0),
            http("request_281")
              .get(uri41 + "/104214.js"),
            http("request_282")
              .get(uri41 + "/104214.js")
              .headers(headers_0),
            http("request_283")
              .get(uri31),
            http("request_284")
              .get(uri31)
              .headers(headers_0),
            http("request_285")
              .get(uri41 + "/generic/main/4.37.6/appcues.main.a313331000dcf82456d55510e872973eca683c39.js"),
            http("request_286")
              .get(uri41 + "/generic/main/4.37.6/appcues.main.a313331000dcf82456d55510e872973eca683c39.js")
              .headers(headers_63),
            http("request_287")
              .get(uri10 + "/web_widget/latest/web-widget-framework-7e6e850c2ae905f5475f.js"),
            http("request_288")
              .get(uri41 + "/generic/main/4.37.6/container.a313331000dcf82456d55510e872973eca683c39.css"),
            http("request_289")
              .get(uri41 + "/generic/main/4.37.6/container.a313331000dcf82456d55510e872973eca683c39.css")
              .headers(headers_63),
            http("request_290")
              .get(uri13 + "/embeddable/config"),
            http("request_291")
              .get(uri10 + "/web_widget/latest/classic/web-widget-classic-87a8c75.js"),
            http("request_292")
              .get(uri23 + "/tracking/counters/timer?t1=1655227997828")
              .headers(headers_126),
            http("request_293")
              .get(uri23 + "/tracking/counters/timer?t1=1655227997828")
              .headers(headers_125),
            http("request_294")
              .get(uri10 + "/web_widget/latest/classic/web-widget-1062-87a8c75.js"),
            http("request_295")
              .get(uri10 + "/web_widget/latest/classic/web-widget-6090-87a8c75.js"),
            http("request_296")
              .get(uri25 + "/v1/settings/get-charging-periods")
              .headers(headers_138),
            http("request_297")
              .get(uri25 + "/v1/settings/get-charging-periods")
              .headers(headers_137),
            http("request_298")
              .options(uri25 + "/v1/projects?filters=%7B%22name%22%3Anull%2C%22client_id%22%3Anull%2C%22team_id%22%3Anull%2C%22frequency%22%3Anull%2C%22dateStart%22%3Anull%2C%22dateEnd%22%3Anull%2C%22status%22%3Anull%2C%22user_id%22%3Anull%2C%22health%22%3Anull%2C%22work_order%22%3Anull%2C%22brand_id%22%3Anull%2C%22product_id%22%3Anull%2C%22labels%22%3Anull%2C%22archived%22%3A2%2C%22created_by%22%3Anull%7D&page=1&orderBy=%7B%22name%22%3Anull%2C%22start%22%3Anull%2C%22end%22%3Anull%2C%22status%22%3Anull%2C%22estimated%22%3Anull%7D")
              .headers(headers_298),
            http("request_299")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_300")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_301")
              .get(uri25 + "/v1/counter/days")
              .headers(headers_137),
            http("request_302")
              .get(uri25 + "/v1/counter/days")
              .headers(headers_138),
            http("request_303")
              .options(uri14)
              .headers(headers_131),
            http("request_304")
              .options(uri14)
              .headers(headers_131),
            http("request_305")
              .get(uri10 + "/web_widget/latest/classic/web-widget-locales/classic/es-419-json-87a8c75.js"),
            http("request_306")
              .get(uri10 + "/web_widget/latest/classic/web-widget-locales/classic/es-json-87a8c75.js"),
            http("request_307")
              .get(uri10 + "/web_widget/latest/classic/web-widget-chat-sdk-87a8c75.js"),
            http("request_308")
              .get(uri07 + "/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=1688&ck=0&ref=https://demo-sp.cor-staging-1.xyz/projects&be=531&fe=1673&dc=1594&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1655227996321,%22n%22:0,%22u%22:427,%22ue%22:428,%22f%22:19,%22dn%22:19,%22dne%22:19,%22c%22:19,%22ce%22:19,%22rq%22:19,%22rp%22:418,%22rpe%22:1038,%22dl%22:441,%22di%22:1593,%22ds%22:1594,%22de%22:1657,%22dc%22:1670,%22l%22:1671,%22le%22:1674%7D,%22navigation%22:%7B%7D%7D&fp=470&fcp=848&jsonp=NREUM.setToken")
              .headers(headers_159),
            http("request_309")
              .get(uri07 + "/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=1688&ck=0&ref=https://demo-sp.cor-staging-1.xyz/projects&be=531&fe=1673&dc=1594&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1655227996321,%22n%22:0,%22u%22:427,%22ue%22:428,%22f%22:19,%22dn%22:19,%22dne%22:19,%22c%22:19,%22ce%22:19,%22rq%22:19,%22rp%22:418,%22rpe%22:1038,%22dl%22:441,%22di%22:1593,%22ds%22:1594,%22de%22:1657,%22dc%22:1670,%22l%22:1671,%22le%22:1674%7D,%22navigation%22:%7B%7D%7D&fp=470&fcp=848&jsonp=NREUM.setToken")
              .headers(headers_0),
            http("request_310")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0310_request.json")),
            http("request_311")
              .get(uri13 + "/embeddable_identify?type=user&data=eyJ1c2VyIjp7ImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20iLCJuYW1lIjoiQXV0b21hdGlvbiBDT1IgQXV0b21hdGlvbiBDT1IiLCJvcmdhbml6YXRpb24iOiJUdSBFbXByZXNhIiwibG9jYWxlSWQiOjExOTR9LCJ1c2VyQWdlbnQiOiJNb3ppbGxhLzUuMCAoTWFjaW50b3NoOyBJbnRlbCBNYWMgT1MgWCAxMF8xNV83KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvMTAyLjAuNTAwNS42MSBTYWZhcmkvNTM3LjM2IiwiYnVpZCI6ImNiOGRlNzc4NTdhYjRmMmNiY2EzYzA4MDlmODc1Njk5Iiwic3VpZCI6ImU2ZWRkMWI0ZDFhODQ5NDE4NWU3MjBlZTZlNWYyYzk0IiwidmVyc2lvbiI6Ijg3YThjNzUiLCJ0aW1lc3RhbXAiOiIyMDIyLTA2LTE0VDE3OjMzOjE4LjIwOFoiLCJ1cmwiOiJodHRwczovL2RlbW8tc3AuY29yLXN0YWdpbmctMS54eXovcHJvamVjdHM%2FcGFnZT0xJmFyY2hpdmVkPTIifQ%3D%3D")
              .headers(headers_79),
            http("request_312")
              .get(uri13 + "/embeddable_blip?type=pageView&data=eyJjaGFubmVsIjoid2ViX3dpZGdldCIsInBhZ2VWaWV3Ijp7InRpbWUiOjMyLCJsb2FkVGltZSI6OS4zOTk5OTk5OTEwNTkzMDMsIm5hdmlnYXRvckxhbmd1YWdlIjoiZXMtNDE5IiwicGFnZVRpdGxlIjoiQ09SIHwgUHJveWVjdG9zIiwidXNlckFnZW50IjoiTW96aWxsYS81LjAgKE1hY2ludG9zaDsgSW50ZWwgTWFjIE9TIFggMTBfMTVfNykgQXBwbGVXZWJLaXQvNTM3LjM2IChLSFRNTCwgbGlrZSBHZWNrbykgQ2hyb21lLzEwMi4wLjUwMDUuNjEgU2FmYXJpLzUzNy4zNiIsImlzTW9iaWxlIjpmYWxzZSwiaXNSZXNwb25zaXZlIjp0cnVlLCJ2aWV3cG9ydE1ldGEiOiJ3aWR0aD1kZXZpY2Utd2lkdGgsIGluaXRpYWwtc2NhbGU9MSwgbWF4aW11bS1zY2FsZT0xLCB1c2VyLXNjYWxhYmxlPW5vIiwiaGVscENlbnRlckRlZHVwIjpmYWxzZSwicmVmZXJyZXIiOiJodHRwczovL2RlbW8tc3AuY29yLXN0YWdpbmctMS54eXovPyZhcmNoaXZlZD0yJnRhc2tUeXBlPWlfYW1fY29sbGFib3JhdG9yIn0sImJ1aWQiOiJjYjhkZTc3ODU3YWI0ZjJjYmNhM2MwODA5Zjg3NTY5OSIsInN1aWQiOiJlNmVkZDFiNGQxYTg0OTQxODVlNzIwZWU2ZTVmMmM5NCIsInZlcnNpb24iOiI4N2E4Yzc1IiwidGltZXN0YW1wIjoiMjAyMi0wNi0xNFQxNzozMzoxOC4yMjZaIiwidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6L3Byb2plY3RzP3BhZ2U9MSZhcmNoaXZlZD0yIn0=")
              .headers(headers_79),
            http("request_313")
              .get(uri25 + "/v1/projects?filters=%7B%22name%22%3Anull%2C%22client_id%22%3Anull%2C%22team_id%22%3Anull%2C%22frequency%22%3Anull%2C%22dateStart%22%3Anull%2C%22dateEnd%22%3Anull%2C%22status%22%3Anull%2C%22user_id%22%3Anull%2C%22health%22%3Anull%2C%22work_order%22%3Anull%2C%22brand_id%22%3Anull%2C%22product_id%22%3Anull%2C%22labels%22%3Anull%2C%22archived%22%3A2%2C%22created_by%22%3Anull%7D&page=1&orderBy=%7B%22name%22%3Anull%2C%22start%22%3Anull%2C%22end%22%3Anull%2C%22status%22%3Anull%2C%22estimated%22%3Anull%7D")
              .headers(headers_138),
            http("request_314")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0314_request.json")),
            http("request_315")
              .get(uri25 + "/v1/projects?filters=%7B%22name%22%3Anull%2C%22client_id%22%3Anull%2C%22team_id%22%3Anull%2C%22frequency%22%3Anull%2C%22dateStart%22%3Anull%2C%22dateEnd%22%3Anull%2C%22status%22%3Anull%2C%22user_id%22%3Anull%2C%22health%22%3Anull%2C%22work_order%22%3Anull%2C%22brand_id%22%3Anull%2C%22product_id%22%3Anull%2C%22labels%22%3Anull%2C%22archived%22%3A2%2C%22created_by%22%3Anull%7D&page=1&orderBy=%7B%22name%22%3Anull%2C%22start%22%3Anull%2C%22end%22%3Anull%2C%22status%22%3Anull%2C%22estimated%22%3Anull%7D")
              .headers(headers_137),
            http("request_316")
              .get(uri23 + "/public/zendesk_jwt")
              .headers(headers_167),
            http("request_317")
              .get(uri23 + "/public/zendesk_jwt")
              .headers(headers_0),
            http("request_318")
              .get(uri14)
              .headers(headers_161),
            http("request_319")
              .get(uri14)
              .headers(headers_162),
            http("request_320")
              .get(uri18 + "/images/health-ok.svg"),
            http("request_321")
              .get(uri18 + "/images/health-ok.svg")
              .headers(headers_0),
            http("request_322")
              .get(uri18 + "/images/health-good.svg"),
            http("request_323")
              .get(uri18 + "/images/health-good.svg")
              .headers(headers_0),
            http("request_324")
              .get(uri23 + "/images/defs.svg")
              .headers(headers_0),
            http("request_325")
              .get(uri39 + "/50x50/user.png"),
            http("request_326")
              .get(uri39 + "/50x50/c-718-299309747830.jpg"),
            http("request_327")
              .get(uri39 + "/50x50/c-718-261209621783.png"),
            http("request_328")
              .get(uri39 + "/50x50/user.png")
              .headers(headers_0),
            http("request_329")
              .get(uri39 + "/50x50/c-718-299309747830.jpg")
              .headers(headers_0),
            http("request_330")
              .get(uri39 + "/50x50/c-718-261209621783.png")
              .headers(headers_0),
            http("request_331")
              .get(uri39 + "/50x50/c-718-215084768192.png"),
            http("request_332")
              .get(uri39 + "/50x50/c-718-177371707882.jpg"),
            http("request_333")
              .get(uri39 + "/50x50/c-718-283601110336.jpg"),
            http("request_334")
              .get(uri39 + "/50x50/c-718-5993203513.jpeg"),
            http("request_335")
              .get(uri39 + "/50x50/c-718-151970099462.jpg"),
            http("request_336")
              .get(uri39 + "/50x50/c-718-215172703746.jpg"),
            http("request_337")
              .get(uri39 + "/50x50/c-718-5481380513.jpeg"),
            http("request_338")
              .get(uri39 + "/50x50/c-718-192240622264.png"),
            http("request_339")
              .get(uri39 + "/50x50/c-718-45159822168.png"),
            http("request_340")
              .get(uri39 + "/50x50/c-718-175006880615.jpg"),
            http("request_341")
              .get(uri39 + "/50x50/c-718-177371707882.jpg")
              .headers(headers_0),
            http("request_342")
              .get(uri39 + "/50x50/c-718-5993203513.jpeg")
              .headers(headers_0),
            http("request_343")
              .get(uri39 + "/50x50/c-718-215084768192.png")
              .headers(headers_0),
            http("request_344")
              .get(uri39 + "/50x50/c-718-283601110336.jpg")
              .headers(headers_0),
            http("request_345")
              .get(uri39 + "/50x50/c-718-151970099462.jpg")
              .headers(headers_0),
            http("request_346")
              .get(uri39 + "/50x50/c-718-175006880615.jpg")
              .headers(headers_0),
            http("request_347")
              .get(uri39 + "/50x50/c-718-192240622264.png")
              .headers(headers_0),
            http("request_348")
              .get(uri39 + "/50x50/c-718-45159822168.png")
              .headers(headers_0),
            http("request_349")
              .get(uri39 + "/50x50/c-718-215172703746.jpg")
              .headers(headers_0),
            http("request_350")
              .get(uri39 + "/50x50/c-718-5481380513.jpeg")
              .headers(headers_0),
            http("request_351")
              .get(uri14)
              .headers(headers_161),
            http("request_352")
              .get(uri14)
              .headers(headers_162),
            http("request_353")
              .post(uri27)
              .headers(headers_79)
              .formParam("account_key", "MgPNdChCq7VHPMpwrDzUJG461CZpWilS")
              .formParam("format", "json")
              .formParam("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiQXV0b21hdGlvbiBDT1IgQXV0b21hdGlvbiBDT1IiLCJlbWFpbCI6ImF1dG8uY29yQHByb2plY3Rjb3IuY29tIiwiaWF0IjoxNjU1MjI3OTk4LCJleHRlcm5hbF9pZCI6IjMzODEwIiwidV9pZCI6IjMzODEwIiwib3JnYW5pemF0aW9uIjoiVHUgRW1wcmVzYSIsInVfcm9sX2lkIjoiMSIsInVfaWRfZGVfZW1wcmVzYSI6IjcxOCIsInVfcG9zaWNpb24iOiJObyBwb3NpdGlvbiIsInVfdWx0aW1vX2xvZ3VlbyI6IjIwMjItMDYtMTQgMDU6MzM6MDUifQ.x42fDEaNU_U1UKeQWW3Epi9SbbZQVpMMgyo0y3ob0lY"),
            http("request_354")
              .get(uri39 + "/50x50/c-718-252318927988.png")
              .headers(headers_354)
              .check(status().is(403)),
            http("request_355")
              .get(uri39 + "/50x50/c-718-252318927988.png")
              .headers(headers_0)
              .check(status().is(403)),
            http("request_356")
              .get(uri23 + "/images/user.png")
              .headers(headers_0),
            http("request_357")
              .get(uri39 + "/50x50/c-718-39570893026.png")
              .headers(headers_354)
              .check(status().is(403)),
            http("request_358")
              .get(uri39 + "/50x50/c-718-126409381007.jpg")
              .headers(headers_354)
              .check(status().is(403)),
            http("request_359")
              .get(uri39 + "/50x50/c-718-39570893026.png")
              .headers(headers_0)
              .check(status().is(403)),
            http("request_360")
              .get(uri39 + "/50x50/c-718-38482734011.jpg")
              .headers(headers_0)
              .check(status().is(403)),
            http("request_361")
              .get(uri39 + "/50x50/c-718-126409381007.jpg")
              .headers(headers_0)
              .check(status().is(403)),
            http("request_362")
              .get(uri39 + "/50x50/c-718-166392324451.png")
              .headers(headers_354)
              .check(status().is(403)),
            http("request_363")
              .get(uri39 + "/50x50/c-718-166392324451.png")
              .headers(headers_0)
              .check(status().is(403)),
            http("request_364")
              .get(uri39 + "/50x50/c-718-198779654879.jpg")
              .headers(headers_354)
              .check(status().is(403)),
            http("request_365")
              .get(uri39 + "/50x50/c-718-198779654879.jpg")
              .headers(headers_0)
              .check(status().is(403)),
            http("request_366")
              .get(uri39 + "/50x50/c-718-38482734011.jpg")
              .headers(headers_354)
              .check(status().is(403)),
            http("request_367")
              .get(uri10 + "/web_widget/latest/classic/web-widget-chat-incoming-message-notification-87a8c75.js"),
            http("request_368")
              .get(uri10 + "/web_widget/latest/classic/fda6cd35495c75f83508d9d2e77ee33d.mp3")
          )
      )
      .pause(1)
      .exec(
        http("request_369")
          .get(uri26)
          .resources(
            http("request_370")
              .get(uri26)
              .headers(headers_0),
            http("request_371")
              .post(uri02 + "/g/collect?v=2&tid=G-WSQHTY6J1Z&gtm=2oe6d0&_p=351868848&_z=ccd.vdB&cid=265574058.1642534102&ul=es-419&sr=1440x900&sid=1655227010&sct=334&seg=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects&dr=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&dt=COR%20%7C%20Proyectos&_s=1")
              .headers(headers_178)
              .body(RawFileBody("recordedsimulation/0371_request.txt"))
          )
      )
      .pause(1)
      .exec(
        http("request_372")
          .get(uri06)
          .resources(
            http("request_373")
              .get(uri17),
            http("request_374")
              .get(uri06)
              .headers(headers_0),
            http("request_375")
              .get(uri17)
              .headers(headers_0),
            http("request_376")
              .get(uri33 + "?sv=6"),
            http("request_377")
              .get(uri33 + "?sv=6")
              .headers(headers_0),
            http("request_378")
              .get(uri29),
            http("request_379")
              .get(uri24),
            http("request_380")
              .get(uri29)
              .headers(headers_0),
            http("request_381")
              .get(uri16),
            http("request_382")
              .get(uri22),
            http("request_383")
              .get(uri24)
              .headers(headers_0),
            http("request_384")
              .get(uri22)
              .headers(headers_0),
            http("request_385")
              .get(uri16)
              .headers(headers_0),
            http("request_386")
              .get(uri37)
              .headers(headers_0),
            http("request_387")
              .get(uri37),
            http("request_388")
              .get(uri05),
            http("request_389")
              .get(uri04 + "?portalId=2960453")
              .headers(headers_79),
            http("request_390")
              .get(uri15 + "?k=1&sd=1440x900&cd=30-bit&cs=UTF-8&ln=es-419&bfp=2779873051&v=1.1&a=2960453&r=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&pu=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&t=(3)+COR+%7C+Proyectos&cts=1655228003034&vi=495905ffa1314565844202a2ec0f0171&nc=false&u=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&b=12257387.3.1655227017385&ce=false&cc=0")
              .headers(headers_59),
            http("request_391")
              .options(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=70ee7568113d414a8f7af1e9e86ef2e2&traceId=70ee7568113d414a8f7af1e9e86ef2e2&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.3.1655227017385&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator")
              .headers(headers_206),
            http("request_392")
              .get(uri04 + "?portalId=2960453")
              .headers(headers_0),
            http("request_393")
              .get(uri15 + "?k=1&sd=1440x900&cd=30-bit&cs=UTF-8&ln=es-419&bfp=2779873051&v=1.1&a=2960453&r=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&pu=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&t=(3)+COR+%7C+Proyectos&cts=1655228003034&vi=495905ffa1314565844202a2ec0f0171&nc=false&u=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&b=12257387.3.1655227017385&ce=false&cc=0")
              .headers(headers_0),
            http("request_394")
              .get(uri01 + "/en_US/fbevents.js"),
            http("request_395")
              .get(uri01 + "/en_US/fbevents.js")
              .headers(headers_0),
            http("request_396")
              .get(uri01 + "/signals/plugins/identity.js?v=2.9.62"),
            http("request_397")
              .get(uri01 + "/signals/plugins/identity.js?v=2.9.62")
              .headers(headers_0),
            http("request_398")
              .get(uri01 + "/signals/config/473120943447503?v=2.9.62&r=stable")
              .headers(headers_0),
            http("request_399")
              .get(uri01 + "/signals/config/473120943447503?v=2.9.62&r=stable"),
            http("request_400")
              .get("/tr/?id=473120943447503&ev=PageView&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&if=false&ts=1655228003391&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=0&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228003358&coo=false&rqm=GET")
              .headers(headers_0),
            http("request_401")
              .get("/tr/?id=473120943447503&ev=PageView&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&if=false&ts=1655228003391&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=0&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228003358&coo=false&rqm=GET")
              .headers(headers_59),
            http("request_402")
              .get(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=70ee7568113d414a8f7af1e9e86ef2e2&traceId=70ee7568113d414a8f7af1e9e86ef2e2&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.3.1655227017385&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator")
              .headers(headers_402),
            http("request_403")
              .get(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=70ee7568113d414a8f7af1e9e86ef2e2&traceId=70ee7568113d414a8f7af1e9e86ef2e2&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.3.1655227017385&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator")
              .headers(headers_403),
            http("request_404")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_405")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_406")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_407")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0407_request.json")),
            http("request_408")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0408_request.json")),
            http("request_409")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0409_request.json")),
            http("request_410")
              .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&if=false&ts=1655228004899&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22(3)%20COR%20%7C%20Proyectos%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228003358&coo=false&es=automatic&tm=3&rqm=GET")
              .headers(headers_59),
            http("request_411")
              .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2F%3F%26archived%3D2%26taskType%3Di_am_collaborator&if=false&ts=1655228004899&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22(3)%20COR%20%7C%20Proyectos%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228003358&coo=false&es=automatic&tm=3&rqm=GET")
              .headers(headers_0)
          )
      )
      .pause(1)
      .exec(
        http("request_412")
          .get(uri12)
          .resources(
            http("request_413")
              .get(uri08),
            http("request_414")
              .get(uri12)
              .headers(headers_0),
            http("request_415")
              .get(uri08)
              .headers(headers_0),
            http("request_416")
              .get(uri09 + "?api_key=6638bcf83ce2474c9f1b6968d86252a76c64c5f974a04380a47426e4ce29cf731e25212dcbfc4af0b390cb698ebb311e068bb391f60745f4b836e75dc2cfa45120f00fdd35454ac8a1a5954576a9d7aa4f699458e3744f2883ea5b513ccd76499a6bf37801d945c19aa5cff88e78b902&data=eyJpZGVudGl0eSI6eyJvcmdhbml6YXRpb24iOnsiaWQiOjcxOCwibmFtZSI6IlR1IEVtcHJlc2EifSwidXNlciI6eyJpZCI6MzM4MTAsIm5hbWUiOiJBdXRvbWF0aW9uIENPUiBBdXRvbWF0aW9uIENPUiIsImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20ifX0sImJyb3dzZXIiOnsidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6L3Byb2plY3RzP3BhZ2U9MSZhcmNoaXZlZD0yIiwidXNlckFnZW50IjoiTW96aWxsYTUwTWFjaW50b3NoSW50ZWxNYWNPU1gxMDE1N0FwcGxlV2ViS2l0NTM3MzZLSFRNTGxpa2VHZWNrb0Nocm9tZTEwMjA1MDA1NjFTYWZhcmk1MzczNiIsInNjcmVlbldpZHRoIjoxNDQwLCJzY3JlZW5IZWlnaHQiOjkwMH0sInZhbHVlIjoxfQ%3D%3D&modified=1655228006018&jsonp=keenJSONPCallback1655228006018")
              .headers(headers_183),
            http("request_417")
              .options(uri32)
              .headers(headers_219),
            http("request_418")
              .get(uri09 + "?api_key=6638bcf83ce2474c9f1b6968d86252a76c64c5f974a04380a47426e4ce29cf731e25212dcbfc4af0b390cb698ebb311e068bb391f60745f4b836e75dc2cfa45120f00fdd35454ac8a1a5954576a9d7aa4f699458e3744f2883ea5b513ccd76499a6bf37801d945c19aa5cff88e78b902&data=eyJpZGVudGl0eSI6eyJvcmdhbml6YXRpb24iOnsiaWQiOjcxOCwibmFtZSI6IlR1IEVtcHJlc2EifSwidXNlciI6eyJpZCI6MzM4MTAsIm5hbWUiOiJBdXRvbWF0aW9uIENPUiBBdXRvbWF0aW9uIENPUiIsImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20ifX0sImJyb3dzZXIiOnsidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6L3Byb2plY3RzP3BhZ2U9MSZhcmNoaXZlZD0yIiwidXNlckFnZW50IjoiTW96aWxsYTUwTWFjaW50b3NoSW50ZWxNYWNPU1gxMDE1N0FwcGxlV2ViS2l0NTM3MzZLSFRNTGxpa2VHZWNrb0Nocm9tZTEwMjA1MDA1NjFTYWZhcmk1MzczNiIsInNjcmVlbldpZHRoIjoxNDQwLCJzY3JlZW5IZWlnaHQiOjkwMH0sInZhbHVlIjoxfQ%3D%3D&modified=1655228006018&jsonp=keenJSONPCallback1655228006018")
              .headers(headers_0),
            http("request_419")
              .options(uri03)
              .headers(headers_222),
            http("request_420")
              .post(uri03)
              .headers(headers_224)
              .body(RawFileBody("recordedsimulation/0420_request.json")),
            http("request_421")
              .post(uri32)
              .headers(headers_220)
              .body(RawFileBody("recordedsimulation/0421_request.txt"))
          )
      )
      .pause(1)
      .exec(
        http("request_422")
          .get(uri18 + "/public/assets/css/compiled-site.css?id=84be8cd57be03e8b5b2e")
          .headers(headers_0)
          .resources(
            http("request_423")
              .get(uri18 + "/public/assets/css/compiled-project-general.css?id=9ef6c9c4f3c7b42fc71d")
              .headers(headers_0),
            http("request_424")
              .get(uri18 + "/public/assets/css/compiled-site.css?id=84be8cd57be03e8b5b2e"),
            http("request_425")
              .get(uri18 + "/public/assets/css/compiled-project-general.css?id=9ef6c9c4f3c7b42fc71d"),
            http("request_426")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-300.woff2")
              .headers(headers_63),
            http("request_427")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-regular.woff2")
              .headers(headers_63),
            http("request_428")
              .get(uri18 + "/public/assets/webfonts/roboto-v29-latin-500.woff2")
              .headers(headers_63),
            http("request_429")
              .get(uri18 + "/public/assets/webfonts/fa-light-300.woff2")
              .headers(headers_63),
            http("request_430")
              .get(uri18 + "/public/assets/webfonts/fa-regular-400.woff2")
              .headers(headers_63),
            http("request_431")
              .get(uri20 + "/gtm.js?id=GTM-PJLC7NW")
              .headers(headers_0),
            http("request_432")
              .get(uri20 + "/gtm.js?id=GTM-PJLC7NW"),
            http("request_433")
              .get(uri19),
            http("request_434")
              .get(uri19)
              .headers(headers_0),
            http("request_435")
              .get(uri02 + "/analytics.js"),
            http("request_436")
              .get(uri20 + "/gtag/js?id=G-WSQHTY6J1Z&l=dataLayer&cx=c"),
            http("request_437")
              .get(uri02 + "/analytics.js")
              .headers(headers_0),
            http("request_438")
              .get(uri20 + "/gtag/js?id=G-WSQHTY6J1Z&l=dataLayer&cx=c")
              .headers(headers_0),
            http("request_439")
              .get(uri02 + "/collect?v=1&_v=j96&a=131402946&t=pageview&_s=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard&ul=es-419&de=UTF-8&dt=COR%20%7C%201A%20-%20Cliente%20Dio&sd=30-bit&sr=1440x900&vp=1440x472&je=0&_u=QAEAAAAB~&jid=&gjid=&cid=265574058.1642534102&tid=UA-63155060-4&_gid=1393270933.1655145942&gtm=2wg6d0PJLC7NW&z=816215672")
              .headers(headers_59),
            http("request_440")
              .get(uri02 + "/collect?v=1&_v=j96&a=131402946&t=pageview&_s=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard&ul=es-419&de=UTF-8&dt=COR%20%7C%201A%20-%20Cliente%20Dio&sd=30-bit&sr=1440x900&vp=1440x472&je=0&_u=QAEAAAAB~&jid=&gjid=&cid=265574058.1642534102&tid=UA-63155060-4&_gid=1393270933.1655145942&gtm=2wg6d0PJLC7NW&z=816215672")
              .headers(headers_0),
            http("request_441")
              .get(uri23 + "/images/logo-academy.svg")
              .headers(headers_0),
            http("request_442")
              .get(uri23 + "/images/no_user.png"),
            http("request_443")
              .get(uri23 + "/images/no_user.png")
              .headers(headers_0),
            http("request_444")
              .get(uri18 + "/public/assets/js/plugins/ckeditor/ckeditor.js")
              .headers(headers_0),
            http("request_445")
              .get(uri18 + "/public/assets/js/plugins/ckeditor/ckeditor.js"),
            http("request_446")
              .post(uri40 + "/")
              .headers(headers_110)
              .formParam("client", "1c6ee3dbaa2efe8638ed8989b115b84a")
              .formParam("e", "[{\"device_id\":\"05b6fe91-1988-4594-b77b-44eae330f47cR\",\"user_id\":null,\"timestamp\":1655228008534,\"event_id\":2994,\"session_id\":1655227010120,\"event_type\":\"$identify\",\"version_name\":null,\"platform\":\"Web\",\"os_name\":\"Chrome\",\"os_version\":\"102\",\"device_model\":\"Mac\",\"language\":\"es-419\",\"api_properties\":{},\"event_properties\":{},\"user_properties\":{\"$set\":{\"nombre\":\"Automation COR\",\"apellido\":\"Automation COR\",\"user_id\":33810,\"email\":\"auto.cor@projectcor.com\",\"company\":\"Tu Empresa\",\"role\":\"C-Level\",\"user_type\":\"internal\"}},\"uuid\":\"4cb60288-10ac-4172-b119-2183400eb0d1\",\"library\":{\"name\":\"amplitude-js\",\"version\":\"3.4.1\"},\"sequence_number\":4162,\"groups\":{},\"user_agent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36\"}]")
              .formParam("v", "2")
              .formParam("upload_time", "1655228008536")
              .formParam("checksum", "13472521c35f0514f9e8a704776a37ab"),
            http("request_447")
              .get(uri23 + "/images/loading-spinner.gif")
              .headers(headers_447),
            http("request_448")
              .get(uri23 + "/images/loading-spinner.gif")
              .headers(headers_0),
            http("request_449")
              .get(uri23 + "/images/noun_Party.svg")
              .headers(headers_0),
            http("request_450")
              .get(uri23 + "/images/user.png")
              .headers(headers_0),
            http("request_451")
              .get(uri18 + "/images/icon_scrum.png"),
            http("request_452")
              .get(uri18 + "/images/icon_scrum.png")
              .headers(headers_0),
            http("request_453")
              .get(uri23 + "/images/loading.svg")
              .headers(headers_0),
            http("request_454")
              .get(uri18 + "/public/assets/js/manifest.js?id=0757f573ad6efd8326e7")
              .headers(headers_0),
            http("request_455")
              .get(uri18 + "/public/assets/js/vendor~utils-1.js?id=b924129610e401a1afdc")
              .headers(headers_0),
            http("request_456")
              .get(uri18 + "/public/assets/js/vendor~utils-2.js?id=dcf0fd47c98a3a3d00c8")
              .headers(headers_0),
            http("request_457")
              .get(uri18 + "/public/assets/js/vendor~commons.js?id=ddb94d4d67cdc9eb2426")
              .headers(headers_0),
            http("request_458")
              .get(uri18 + "/public/assets/js/vendor~hours~modal.js?id=fba77b0c3e58265a2d0a")
              .headers(headers_0),
            http("request_459")
              .get(uri18 + "/public/assets/js/vendor~ui-1.js?id=c233ea4b6ef9257450b3")
              .headers(headers_0),
            http("request_460")
              .get(uri18 + "/public/assets/js/vendor~ui-2.js?id=34570b12ddb4ca9e3f09")
              .headers(headers_0),
            http("request_461")
              .get(uri18 + "/public/assets/js/compiled-site.js?id=e338b364c735026a389e")
              .headers(headers_0),
            http("request_462")
              .get(uri18 + "/public/assets/js/new-panel.js?id=ee9d8b5d4d8bb7b8dfec")
              .headers(headers_0),
            http("request_463")
              .get(uri39 + "/300x300/c-718-198779654879.jpg")
              .headers(headers_354)
              .check(status().is(403)),
            http("request_464")
              .get(uri18 + "/public/assets/js/compiled-global-components-react.js?id=8bf44c29a12a0cb95e9d")
              .headers(headers_0),
            http("request_465")
              .get(uri18 + "/public/assets/js/bulk-actions.js?id=ea52a44fd768ee833b8c")
              .headers(headers_0),
            http("request_466")
              .get(uri23 + "/projects/258521/dashboard")
              .headers(headers_255),
            http("request_467")
              .get(uri23 + "/projects/258521/dashboard")
              .headers(headers_256),
            http("request_468")
              .get(uri18 + "/public/assets/js/compiled-global-search.js?id=cce315cf302a7116cf51")
              .headers(headers_0),
            http("request_469")
              .get(uri18 + "/public/assets/js/compiled-global-notifications.js?id=7a8248d17573ad6c0020")
              .headers(headers_0),
            http("request_470")
              .get(uri18 + "/public/assets/js/compiled-hours-modal.js?id=f75c7e2d9afe2ab34f11")
              .headers(headers_0),
            http("request_471")
              .get(uri18 + "/public/assets/js/compiled-new-task-dashboard.js?id=7f7bfbfef4207f283f4c")
              .headers(headers_0),
            http("request_472")
              .get(uri18 + "/public/assets/js/compiled-filters.js?id=033ee9db61cc11f8208d"),
            http("request_473")
              .get(uri18 + "/public/assets/js/compiled-tasksDashboardTooltips.js?id=1de68599457078eb8c2e"),
            http("request_474")
              .get(uri18 + "/public/assets/js/compiled-upsells-project.js?id=4ec0cb785a8f86bef748"),
            http("request_475")
              .get(uri18 + "/public/assets/js/FeesPanel.js?id=89cec2c01a250fc6da9f"),
            http("request_476")
              .get(uri18 + "/public/assets/js/compiled-project-dashboard.js?id=b33295c3067951280500"),
            http("request_477")
              .get(uri18 + "/public/assets/js/compiled-tasksDashboardTooltips.js?id=1de68599457078eb8c2e")
              .headers(headers_0),
            http("request_478")
              .get(uri18 + "/public/assets/js/compiled-filters.js?id=033ee9db61cc11f8208d")
              .headers(headers_0),
            http("request_479")
              .get(uri18 + "/public/assets/js/compiled-upsells-project.js?id=4ec0cb785a8f86bef748")
              .headers(headers_0),
            http("request_480")
              .get(uri18 + "/public/assets/js/FeesPanel.js?id=89cec2c01a250fc6da9f")
              .headers(headers_0),
            http("request_481")
              .get(uri18 + "/public/assets/js/compiled-project-dashboard.js?id=b33295c3067951280500")
              .headers(headers_0),
            http("request_482")
              .get(uri39 + "/300x300/c-718-198779654879.jpg")
              .headers(headers_0)
              .check(status().is(403)),
            http("request_483")
              .get(uri23 + "/images/defs.svg")
              .headers(headers_0),
            http("request_484")
              .get(uri18 + "/images/prev.png"),
            http("request_485")
              .get(uri18 + "/images/next.png"),
            http("request_486")
              .get(uri18 + "/images/prev.png")
              .headers(headers_0),
            http("request_487")
              .get(uri18 + "/images/loading.gif"),
            http("request_488")
              .get(uri18 + "/images/close.png"),
            http("request_489")
              .get(uri18 + "/images/next.png")
              .headers(headers_0),
            http("request_490")
              .get(uri18 + "/images/loading.gif")
              .headers(headers_0),
            http("request_491")
              .get(uri18 + "/images/close.png")
              .headers(headers_0),
            http("request_492")
              .get(uri39 + "/300x300/user.png")
              .headers(headers_0),
            http("request_493")
              .get(uri10 + "/ekr/snippet.js?key=7b70f1ce-8a16-4be7-895f-45775342919a")
              .headers(headers_0),
            http("request_494")
              .get(uri10 + "/ekr/snippet.js?key=7b70f1ce-8a16-4be7-895f-45775342919a"),
            http("request_495")
              .get(uri41 + "/104214.js"),
            http("request_496")
              .get(uri41 + "/104214.js")
              .headers(headers_0),
            http("request_497")
              .get(uri31),
            http("request_498")
              .get(uri31)
              .headers(headers_0),
            http("request_499")
              .get(uri41 + "/generic/main/4.37.6/appcues.main.a313331000dcf82456d55510e872973eca683c39.js"),
            http("request_500")
              .get(uri41 + "/generic/main/4.37.6/appcues.main.a313331000dcf82456d55510e872973eca683c39.js")
              .headers(headers_63),
            http("request_501")
              .get(uri41 + "/generic/main/4.37.6/container.a313331000dcf82456d55510e872973eca683c39.css"),
            http("request_502")
              .get(uri41 + "/generic/main/4.37.6/container.a313331000dcf82456d55510e872973eca683c39.css")
              .headers(headers_63),
            http("request_503")
              .get(uri10 + "/web_widget/latest/web-widget-framework-7e6e850c2ae905f5475f.js"),
            http("request_504")
              .get(uri13 + "/embeddable/config"),
            http("request_505")
              .get(uri10 + "/web_widget/latest/classic/web-widget-classic-87a8c75.js"),
            http("request_506")
              .get(uri10 + "/web_widget/latest/classic/web-widget-6090-87a8c75.js"),
            http("request_507")
              .get(uri10 + "/web_widget/latest/classic/web-widget-1062-87a8c75.js"),
            http("request_508")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_509")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_510")
              .options(uri14)
              .headers(headers_131),
            http("request_511")
              .get(uri10 + "/web_widget/latest/classic/web-widget-locales/classic/es-419-json-87a8c75.js"),
            http("request_512")
              .get(uri10 + "/web_widget/latest/classic/web-widget-locales/classic/es-json-87a8c75.js"),
            http("request_513")
              .get(uri10 + "/web_widget/latest/classic/web-widget-chat-sdk-87a8c75.js"),
            http("request_514")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_515")
              .options(uri21 + "/")
              .headers(headers_135),
            http("request_516")
              .options(uri14)
              .headers(headers_131),
            http("request_517")
              .get(uri25 + "/v1/counter/days")
              .headers(headers_138),
            http("request_518")
              .get(uri25 + "/v1/counter/days")
              .headers(headers_137),
            http("request_519")
              .get(uri25 + "/v1/users?page=false")
              .headers(headers_138),
            http("request_520")
              .get(uri25 + "/v1/settings/get-charging-periods")
              .headers(headers_138),
            http("request_521")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0521_request.json")),
            http("request_522")
              .get(uri25 + "/v1/users?page=false")
              .headers(headers_137),
            http("request_523")
              .get(uri25 + "/v1/settings/get-charging-periods")
              .headers(headers_137),
            http("request_524")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0524_request.json")),
            http("request_525")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0525_request.json")),
            http("request_526")
              .get(uri13 + "/embeddable_identify?type=user&data=eyJ1c2VyIjp7ImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20iLCJuYW1lIjoiQXV0b21hdGlvbiBDT1IgQXV0b21hdGlvbiBDT1IiLCJvcmdhbml6YXRpb24iOiJUdSBFbXByZXNhIiwibG9jYWxlSWQiOjExOTR9LCJ1c2VyQWdlbnQiOiJNb3ppbGxhLzUuMCAoTWFjaW50b3NoOyBJbnRlbCBNYWMgT1MgWCAxMF8xNV83KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvMTAyLjAuNTAwNS42MSBTYWZhcmkvNTM3LjM2IiwiYnVpZCI6ImNiOGRlNzc4NTdhYjRmMmNiY2EzYzA4MDlmODc1Njk5Iiwic3VpZCI6ImU2ZWRkMWI0ZDFhODQ5NDE4NWU3MjBlZTZlNWYyYzk0IiwidmVyc2lvbiI6Ijg3YThjNzUiLCJ0aW1lc3RhbXAiOiIyMDIyLTA2LTE0VDE3OjMzOjMxLjQyMFoiLCJ1cmwiOiJodHRwczovL2RlbW8tc3AuY29yLXN0YWdpbmctMS54eXovcHJvamVjdHMvMjU4NTIxL2Rhc2hib2FyZD9hcmNoaXZlZD0yIn0%3D")
              .headers(headers_79),
            http("request_527")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0527_request.json")),
            http("request_528")
              .get(uri13 + "/embeddable_blip?type=pageView&data=eyJjaGFubmVsIjoid2ViX3dpZGdldCIsInBhZ2VWaWV3Ijp7InRpbWUiOjM1LCJsb2FkVGltZSI6NC45MDAwMDAwMDU5NjA0NjQ1LCJuYXZpZ2F0b3JMYW5ndWFnZSI6ImVzLTQxOSIsInBhZ2VUaXRsZSI6IkNPUiB8IDFBIC0gQ2xpZW50ZSBEaW8iLCJ1c2VyQWdlbnQiOiJNb3ppbGxhLzUuMCAoTWFjaW50b3NoOyBJbnRlbCBNYWMgT1MgWCAxMF8xNV83KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvMTAyLjAuNTAwNS42MSBTYWZhcmkvNTM3LjM2IiwiaXNNb2JpbGUiOmZhbHNlLCJpc1Jlc3BvbnNpdmUiOnRydWUsInZpZXdwb3J0TWV0YSI6IndpZHRoPWRldmljZS13aWR0aCwgaW5pdGlhbC1zY2FsZT0xLCBtYXhpbXVtLXNjYWxlPTEsIHVzZXItc2NhbGFibGU9bm8iLCJoZWxwQ2VudGVyRGVkdXAiOmZhbHNlLCJyZWZlcnJlciI6Imh0dHBzOi8vZGVtby1zcC5jb3Itc3RhZ2luZy0xLnh5ei9wcm9qZWN0cz9wYWdlPTEmYXJjaGl2ZWQ9MiJ9LCJidWlkIjoiY2I4ZGU3Nzg1N2FiNGYyY2JjYTNjMDgwOWY4NzU2OTkiLCJzdWlkIjoiZTZlZGQxYjRkMWE4NDk0MTg1ZTcyMGVlNmU1ZjJjOTQiLCJ2ZXJzaW9uIjoiODdhOGM3NSIsInRpbWVzdGFtcCI6IjIwMjItMDYtMTRUMTc6MzM6MzEuNDQwWiIsInVybCI6Imh0dHBzOi8vZGVtby1zcC5jb3Itc3RhZ2luZy0xLnh5ei9wcm9qZWN0cy8yNTg1MjEvZGFzaGJvYXJkP2FyY2hpdmVkPTIifQ==")
              .headers(headers_79),
            http("request_529")
              .get(uri14)
              .headers(headers_161),
            http("request_530")
              .get(uri14)
              .headers(headers_162),
            http("request_531")
              .options(uri25 + "/v1/projects/258521?page=false&tasks=false")
              .headers(headers_298),
            http("request_532")
              .get(uri23 + "/tracking/counters/timer?t1=1655228010916")
              .headers(headers_125),
            http("request_533")
              .get(uri23 + "/public/zendesk_jwt")
              .headers(headers_167),
            http("request_534")
              .get(uri23 + "/tracking/counters/timer?t1=1655228010916")
              .headers(headers_126),
            http("request_535")
              .get(uri23 + "/sounds/case-closed.mp3")
              .headers(headers_535),
            http("request_536")
              .get(uri23 + "/sounds/case-closed.mp3")
              .headers(headers_536),
            http("request_537")
              .get(uri23 + "/public/zendesk_jwt")
              .headers(headers_0),
            http("request_538")
              .get(uri35),
            http("request_539")
              .get(uri35)
              .headers(headers_0),
            http("request_540")
              .get(uri25 + "/v1/projects/258521?page=false&tasks=false")
              .headers(headers_138),
            http("request_541")
              .get(uri25 + "/v1/projects/258521?page=false&tasks=false")
              .headers(headers_137),
            http("request_542")
              .get(uri14)
              .headers(headers_162),
            http("request_543")
              .get(uri14)
              .headers(headers_161),
            http("request_544")
              .post(uri27)
              .headers(headers_79)
              .formParam("account_key", "MgPNdChCq7VHPMpwrDzUJG461CZpWilS")
              .formParam("format", "json")
              .formParam("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiQXV0b21hdGlvbiBDT1IgQXV0b21hdGlvbiBDT1IiLCJlbWFpbCI6ImF1dG8uY29yQHByb2plY3Rjb3IuY29tIiwiaWF0IjoxNjU1MjI4MDEyLCJleHRlcm5hbF9pZCI6IjMzODEwIiwidV9pZCI6IjMzODEwIiwib3JnYW5pemF0aW9uIjoiVHUgRW1wcmVzYSIsInVfcm9sX2lkIjoiMSIsInVfaWRfZGVfZW1wcmVzYSI6IjcxOCIsInVfcG9zaWNpb24iOiJObyBwb3NpdGlvbiIsInVfdWx0aW1vX2xvZ3VlbyI6IjIwMjItMDYtMTQgMDU6MzM6MDUifQ.DXoQuXOaIbZCQ7w67WQtQzg8jyE0m53yU9AFK8YXjx8"),
            http("request_545")
              .get(uri07 + "/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=4224&ck=0&ref=https://demo-sp.cor-staging-1.xyz/projects/258521/dashboard&be=790&fe=4214&dc=3413&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1655228007721,%22n%22:0,%22u%22:690,%22ue%22:690,%22f%22:29,%22dn%22:29,%22dne%22:29,%22c%22:29,%22ce%22:29,%22rq%22:29,%22rp%22:676,%22rpe%22:3143,%22dl%22:713,%22di%22:3412,%22ds%22:3413,%22de%22:3502,%22dc%22:4214,%22l%22:4214,%22le%22:4215%7D,%22navigation%22:%7B%7D%7D&fp=745&fcp=933&jsonp=NREUM.setToken")
              .headers(headers_0),
            http("request_546")
              .get(uri07 + "/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=4224&ck=0&ref=https://demo-sp.cor-staging-1.xyz/projects/258521/dashboard&be=790&fe=4214&dc=3413&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1655228007721,%22n%22:0,%22u%22:690,%22ue%22:690,%22f%22:29,%22dn%22:29,%22dne%22:29,%22c%22:29,%22ce%22:29,%22rq%22:29,%22rp%22:676,%22rpe%22:3143,%22dl%22:713,%22di%22:3412,%22ds%22:3413,%22de%22:3502,%22dc%22:4214,%22l%22:4214,%22le%22:4215%7D,%22navigation%22:%7B%7D%7D&fp=745&fcp=933&jsonp=NREUM.setToken")
              .headers(headers_159),
            http("request_547")
              .options(uri25 + "/v1/tasks?filters=%7B%22projects%22%3A258521%2C%22archived%22%3A%222%22%7D&page=1&order=%7B%22task%22%3A%22-ALL-%22%2C%22sprint%22%3A%22-ALL-%22%2C%22deadline%22%3A%22ASC%22%2C%22PM%22%3A%22-ALL-%22%2C%22priority%22%3A%22-ALL-%22%7D")
              .headers(headers_298),
            http("request_548")
              .options(uri25 + "/v1/showUpsellAlert")
              .headers(headers_548),
            http("request_549")
              .options(uri25 + "/v1/tasks/gantt/dashboard?filters%5Bprojects%5D=258521&filters%5Bsection%5D=projects_section&page=false")
              .headers(headers_298),
            http("request_550")
              .post(uri25 + "/v1/showUpsellAlert")
              .headers(headers_550)
              .formParam("projectId", "258521"),
            http("request_551")
              .get(uri25 + "/v1/tasks?filters=%7B%22projects%22%3A258521%2C%22archived%22%3A%222%22%7D&page=1&order=%7B%22task%22%3A%22-ALL-%22%2C%22sprint%22%3A%22-ALL-%22%2C%22deadline%22%3A%22ASC%22%2C%22PM%22%3A%22-ALL-%22%2C%22priority%22%3A%22-ALL-%22%7D")
              .headers(headers_138),
            http("request_552")
              .get(uri25 + "/v1/tasks?filters=%7B%22projects%22%3A258521%2C%22archived%22%3A%222%22%7D&page=1&order=%7B%22task%22%3A%22-ALL-%22%2C%22sprint%22%3A%22-ALL-%22%2C%22deadline%22%3A%22ASC%22%2C%22PM%22%3A%22-ALL-%22%2C%22priority%22%3A%22-ALL-%22%7D")
              .headers(headers_137),
            http("request_553")
              .get(uri39 + "/50x50/user.png")
              .headers(headers_0),
            http("request_554")
              .get(uri25 + "/v1/tasks/gantt/dashboard?filters%5Bprojects%5D=258521&filters%5Bsection%5D=projects_section&page=false")
              .headers(headers_138),
            http("request_555")
              .get(uri25 + "/v1/tasks/gantt/dashboard?filters%5Bprojects%5D=258521&filters%5Bsection%5D=projects_section&page=false")
              .headers(headers_137),
            http("request_556")
              .options(uri25 + "/v1/projects/258521/someTaskHasSprint")
              .headers(headers_298),
            http("request_557")
              .get(uri25 + "/v1/projects/258521/someTaskHasSprint")
              .headers(headers_138),
            http("request_558")
              .get(uri25 + "/v1/projects/258521/someTaskHasSprint")
              .headers(headers_137),
            http("request_559")
              .get(uri42)
              .headers(headers_79),
            http("request_560")
              .get(uri42)
              .headers(headers_0),
            http("request_561")
              .post(uri02 + "/g/collect?v=2&tid=G-WSQHTY6J1Z&gtm=2oe6d0&_p=131402946&_z=ccd.vdB&cid=265574058.1642534102&ul=es-419&sr=1440x900&sid=1655227010&sct=334&seg=1&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard&dr=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&dt=COR%20%7C%201A%20-%20Cliente%20Dio&_s=1")
              .headers(headers_178)
              .body(RawFileBody("recordedsimulation/0561_request.txt")),
            http("request_562")
              .get(uri10 + "/web_widget/latest/classic/web-widget-chat-incoming-message-notification-87a8c75.js"),
            http("request_563")
              .get(uri10 + "/web_widget/latest/classic/fda6cd35495c75f83508d9d2e77ee33d.mp3"),
            http("request_564")
              .get(uri26)
              .headers(headers_0),
            http("request_565")
              .get(uri26),
            http("request_566")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0566_request.json")),
            http("request_567")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0567_request.json")),
            http("request_568")
              .get(uri23 + "/assets/js/3946.44452c356c6cd5f4ce41.js")
              .headers(headers_0),
            http("request_569")
              .get(uri23 + "/assets/js/3946.44452c356c6cd5f4ce41.js")
              .headers(headers_569),
            http("request_570")
              .get(uri23 + "/assets/js/3946.44452c356c6cd5f4ce41.js"),
            http("request_571")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0571_request.json")),
            http("request_572")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0572_request.json")),
            http("request_573")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0573_request.json")),
            http("request_574")
              .get(uri41 + "/generic/main/4.37.6/tooltip.a313331000dcf82456d55510e872973eca683c39.css")
              .headers(headers_574),
            http("request_575")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0575_request.json")),
            http("request_576")
              .get(uri38 + "?family=Open+Sans:300,300i,400,400i,700,700i")
              .headers(headers_576),
            http("request_577")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0577_request.json")),
            http("request_578")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0578_request.json")),
            http("request_579")
              .get(uri34),
            http("request_580")
              .get(uri34)
              .headers(headers_580),
            http("request_581")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0581_request.json")),
            http("request_582")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0582_request.json")),
            http("request_583")
              .post(uri21 + "/")
              .headers(headers_157)
              .body(RawFileBody("recordedsimulation/0583_request.json")),
            http("request_584")
              .get(uri06),
            http("request_585")
              .get(uri06)
              .headers(headers_0),
            http("request_586")
              .get(uri17),
            http("request_587")
              .get(uri33 + "?sv=6"),
            http("request_588")
              .get(uri17)
              .headers(headers_0),
            http("request_589")
              .get(uri33 + "?sv=6")
              .headers(headers_0),
            http("request_590")
              .get(uri37),
            http("request_591")
              .get(uri37)
              .headers(headers_0),
            http("request_592")
              .get(uri16),
            http("request_593")
              .get(uri24),
            http("request_594")
              .get(uri29),
            http("request_595")
              .get(uri16)
              .headers(headers_0),
            http("request_596")
              .get(uri29)
              .headers(headers_0),
            http("request_597")
              .get(uri24)
              .headers(headers_0),
            http("request_598")
              .get(uri22),
            http("request_599")
              .get(uri22)
              .headers(headers_0),
            http("request_600")
              .get(uri05),
            http("request_601")
              .options(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=29fc75a007f2480dacf08475021a670f&traceId=29fc75a007f2480dacf08475021a670f&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.4.1655227017385&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2")
              .headers(headers_206),
            http("request_602")
              .get(uri15 + "?k=1&sd=1440x900&cd=30-bit&cs=UTF-8&ln=es-419&bfp=2779873051&v=1.1&a=2960453&r=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&pu=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard%3Fpage%3D1%26archived%3D2&t=(3)+COR+%7C+1A+-+Cliente+Dio&cts=1655228017047&vi=495905ffa1314565844202a2ec0f0171&nc=false&u=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&b=12257387.4.1655227017385&ce=false&cc=0")
              .headers(headers_59),
            http("request_603")
              .get(uri15 + "?k=1&sd=1440x900&cd=30-bit&cs=UTF-8&ln=es-419&bfp=2779873051&v=1.1&a=2960453&r=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&pu=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard%3Fpage%3D1%26archived%3D2&t=(3)+COR+%7C+1A+-+Cliente+Dio&cts=1655228017047&vi=495905ffa1314565844202a2ec0f0171&nc=false&u=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&b=12257387.4.1655227017385&ce=false&cc=0")
              .headers(headers_0),
            http("request_604")
              .get(uri04 + "?portalId=2960453")
              .headers(headers_79),
            http("request_605")
              .get(uri04 + "?portalId=2960453")
              .headers(headers_0),
            http("request_606")
              .get(uri01 + "/en_US/fbevents.js"),
            http("request_607")
              .get(uri01 + "/en_US/fbevents.js")
              .headers(headers_0),
            http("request_608")
              .get(uri01 + "/signals/plugins/identity.js?v=2.9.62"),
            http("request_609")
              .get(uri01 + "/signals/plugins/identity.js?v=2.9.62")
              .headers(headers_0),
            http("request_610")
              .get(uri01 + "/signals/config/473120943447503?v=2.9.62&r=stable")
              .headers(headers_0),
            http("request_611")
              .get(uri01 + "/signals/config/473120943447503?v=2.9.62&r=stable"),
            http("request_612")
              .get("/tr/?id=473120943447503&ev=PageView&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&if=false&ts=1655228017439&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=0&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228017406&coo=false&exp=p1&rqm=GET")
              .headers(headers_59),
            http("request_613")
              .get(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=29fc75a007f2480dacf08475021a670f&traceId=29fc75a007f2480dacf08475021a670f&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.4.1655227017385&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2")
              .headers(headers_613),
            http("request_614")
              .get("/tr/?id=473120943447503&ev=PageView&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&if=false&ts=1655228017439&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=0&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228017406&coo=false&exp=p1&rqm=GET")
              .headers(headers_0),
            http("request_615")
              .get(uri36 + "?portalId=2960453&conversations-embed=static-1.10231&mobile=false&messagesUtk=29fc75a007f2480dacf08475021a670f&traceId=29fc75a007f2480dacf08475021a670f&hubspotUtk=495905ffa1314565844202a2ec0f0171&__hstc=12257387.495905ffa1314565844202a2ec0f0171.1642534146975.1655215509014.1655227017385.290&__hssc=12257387.4.1655227017385&referrer=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2")
              .headers(headers_615)
          )
      )
      .pause(1)
      .exec(
        http("request_616")
          .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&if=false&ts=1655228018946&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22(3)%20COR%20%7C%201A%20-%20Cliente%20Dio%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228017406&coo=false&es=automatic&tm=3&exp=p1&rqm=GET")
          .headers(headers_0)
          .resources(
            http("request_617")
              .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&if=false&ts=1655228018946&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22(3)%20COR%20%7C%201A%20-%20Cliente%20Dio%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228017406&coo=false&es=automatic&tm=3&exp=p1&rqm=GET")
              .headers(headers_59),
            http("request_618")
              .get(uri12),
            http("request_619")
              .get(uri12)
              .headers(headers_0),
            http("request_620")
              .get(uri08)
              .headers(headers_0),
            http("request_621")
              .get(uri08),
            http("request_622")
              .options(uri32)
              .headers(headers_219),
            http("request_623")
              .get(uri09 + "?api_key=6638bcf83ce2474c9f1b6968d86252a76c64c5f974a04380a47426e4ce29cf731e25212dcbfc4af0b390cb698ebb311e068bb391f60745f4b836e75dc2cfa45120f00fdd35454ac8a1a5954576a9d7aa4f699458e3744f2883ea5b513ccd76499a6bf37801d945c19aa5cff88e78b902&data=eyJpZGVudGl0eSI6eyJvcmdhbml6YXRpb24iOnsiaWQiOjcxOCwibmFtZSI6IlR1IEVtcHJlc2EifSwidXNlciI6eyJpZCI6MzM4MTAsIm5hbWUiOiJBdXRvbWF0aW9uIENPUiBBdXRvbWF0aW9uIENPUiIsImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20ifX0sImJyb3dzZXIiOnsidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6L3Byb2plY3RzLzI1ODUyMS9kYXNoYm9hcmQ%2FcGFnZT0xJmFyY2hpdmVkPTIiLCJ1c2VyQWdlbnQiOiJNb3ppbGxhNTBNYWNpbnRvc2hJbnRlbE1hY09TWDEwMTU3QXBwbGVXZWJLaXQ1MzczNktIVE1MbGlrZUdlY2tvQ2hyb21lMTAyMDUwMDU2MVNhZmFyaTUzNzM2Iiwic2NyZWVuV2lkdGgiOjE0NDAsInNjcmVlbkhlaWdodCI6OTAwfSwidmFsdWUiOjF9&modified=1655228019962&jsonp=keenJSONPCallback1655228019963")
              .headers(headers_183),
            http("request_624")
              .get(uri09 + "?api_key=6638bcf83ce2474c9f1b6968d86252a76c64c5f974a04380a47426e4ce29cf731e25212dcbfc4af0b390cb698ebb311e068bb391f60745f4b836e75dc2cfa45120f00fdd35454ac8a1a5954576a9d7aa4f699458e3744f2883ea5b513ccd76499a6bf37801d945c19aa5cff88e78b902&data=eyJpZGVudGl0eSI6eyJvcmdhbml6YXRpb24iOnsiaWQiOjcxOCwibmFtZSI6IlR1IEVtcHJlc2EifSwidXNlciI6eyJpZCI6MzM4MTAsIm5hbWUiOiJBdXRvbWF0aW9uIENPUiBBdXRvbWF0aW9uIENPUiIsImVtYWlsIjoiYXV0by5jb3JAcHJvamVjdGNvci5jb20ifX0sImJyb3dzZXIiOnsidXJsIjoiaHR0cHM6Ly9kZW1vLXNwLmNvci1zdGFnaW5nLTEueHl6L3Byb2plY3RzLzI1ODUyMS9kYXNoYm9hcmQ%2FcGFnZT0xJmFyY2hpdmVkPTIiLCJ1c2VyQWdlbnQiOiJNb3ppbGxhNTBNYWNpbnRvc2hJbnRlbE1hY09TWDEwMTU3QXBwbGVXZWJLaXQ1MzczNktIVE1MbGlrZUdlY2tvQ2hyb21lMTAyMDUwMDU2MVNhZmFyaTUzNzM2Iiwic2NyZWVuV2lkdGgiOjE0NDAsInNjcmVlbkhlaWdodCI6OTAwfSwidmFsdWUiOjF9&modified=1655228019962&jsonp=keenJSONPCallback1655228019963")
              .headers(headers_0),
            http("request_625")
              .options(uri03)
              .headers(headers_222),
            http("request_626")
              .post(uri32)
              .headers(headers_220)
              .body(RawFileBody("recordedsimulation/0626_request.txt")),
            http("request_627")
              .post(uri03)
              .headers(headers_224)
              .body(RawFileBody("recordedsimulation/0627_request.json"))
          )
      )
      .pause(1)
      .exec(
        http("request_628")
          .post(uri07 + "/events/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=14225&ck=0&ref=https://demo-sp.cor-staging-1.xyz/projects/258521/dashboard")
          .headers(headers_628)
          .body(RawFileBody("recordedsimulation/0628_request.gif"))
      )
      .pause(22)
      .exec(
        http("request_629")
          .post(uri40 + "/")
          .headers(headers_110)
          .formParam("client", "1c6ee3dbaa2efe8638ed8989b115b84a")
          .formParam("e", "[{\"device_id\":\"05b6fe91-1988-4594-b77b-44eae330f47cR\",\"user_id\":null,\"timestamp\":1655228044268,\"event_id\":1169,\"session_id\":1655227010120,\"event_type\":\"VISITED_PROJECT_TASKS\",\"version_name\":null,\"platform\":\"Web\",\"os_name\":\"Chrome\",\"os_version\":\"102\",\"device_model\":\"Mac\",\"language\":\"es-419\",\"api_properties\":{},\"event_properties\":{\"role\":\"C_LEVEL\"},\"user_properties\":{},\"uuid\":\"9606f7b8-4af4-4456-9fee-9e7fd971a2c7\",\"library\":{\"name\":\"amplitude-js\",\"version\":\"3.4.1\"},\"sequence_number\":4163,\"groups\":{},\"user_agent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36\"}]")
          .formParam("v", "2")
          .formParam("upload_time", "1655228044273")
          .formParam("checksum", "f19294ae5a2bbe90bc4f9033c216b9f4")
      )
      .pause(26)
      .exec(
        http("request_630")
          .post(uri07 + "/jserrors/1/87c8094477?a=297915319&sa=1&v=1198.fe6ec20&t=Unnamed%20Transaction&rst=64233&ck=0&ref=https://demo-sp.cor-staging-1.xyz/projects/258521/dashboard")
          .headers(headers_628)
          .body(RawFileBody("recordedsimulation/0630_request.gif"))
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
