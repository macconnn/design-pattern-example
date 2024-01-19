package template;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public abstract class EncryptTemplate{
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
