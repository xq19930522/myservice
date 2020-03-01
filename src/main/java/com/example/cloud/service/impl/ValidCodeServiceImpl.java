package com.example.cloud.service.impl;


import com.example.cloud.bean.ValidCode;
import com.example.cloud.repository.ValidCodeRepository;
import com.example.cloud.service.ValidCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ValidCodeServiceImpl implements ValidCodeService {

    @Override
    public String validCode(String phoneNumber) {
        return null;
    }

    @Override
    public List<ValidCode> findAll() {
        return repository.findAll();
    }

    @Autowired
    private ValidCodeRepository repository;
    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "LTAIeMm01IIFkFwi";
    static final String accessKeySecret = "fjYBIT6C8X6ZxScOZY8JHVhMHgjmpg";
    static String Code = null;

/*    @Override
    public String validCode(String phoneNumber) {

        try {
            sendSms(phoneNumber);
        } catch (ClientException e) {
            System.out.println("发送短信失败");
            e.printStackTrace();
        }
        ValidCode code = new ValidCode();
        code.setValidCode(Integer.parseInt(Code));
        code.setPhonenumber(phoneNumber);
        ValidCode validCode = repository.save(code);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(70000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repository.delete(validCode.getId());
            }
        }).start();
        return Code;
    }*/

/*    public static SendSmsResponse sendSms(String phoneNumber) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phoneNumber);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("手机云助手");
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_111895459");
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(9) + "");
        }
        Code = sb.toString();
        request.setTemplateParam("{\"code\":" + Code + "}");//\"123456\"
        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        //request.setOutId("yourOutId");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

        return sendSmsResponse;
    }*/
}
