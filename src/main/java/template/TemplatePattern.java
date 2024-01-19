package template;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
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

    public static abstract class EncryptTemplate{
        public final byte[] encrypt(String algorithm, Key key, byte[] data) throws Exception{
            Cipher cipher = getCipher(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return cipher.doFinal(data);
        }
        public final byte[] decrypt(String algorithm, Key key, byte[] data) throws Exception{
            Cipher cipher = getCipher(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(data);
        }

        protected abstract Cipher getCipher(String algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException;
    }

    public static class RsaEncryption extends EncryptTemplate {
        @Override
        protected Cipher getCipher(String algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException {
            return Cipher.getInstance(algorithm);
        }
    }

}
