package template;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.security.*;

public abstract class TemplatePattern {

    public static void main(String[] args) throws Exception{
        EncryptTemplate rsa = new RsaEncryption();
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        KeyPair keyPair = keyPairGen.generateKeyPair();

        byte[] encryptData = rsa.encrypt("RSA", keyPair.getPublic(), "hello".getBytes());
        System.out.println(String.format("encryptData : %s", Base64.encode(encryptData)));

        System.out.println("=========================================");

        byte[] decryptData = rsa.decrypt("RSA", keyPair.getPrivate(), encryptData);
        System.out.println(String.format("decryptData : %s", new String(decryptData)));
    }
}
