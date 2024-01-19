package template;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class RsaEncryption extends EncryptTemplate {
    @Override
    protected Cipher getCipher(String algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance(algorithm);
    }
}
