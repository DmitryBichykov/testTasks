package com.metanit;

import javax.crypto.*;
import java.io.*;
import java.security.*;

public class Aes256Class implements Serializable {
    private Key privateKey;

    public void encode(StringBuilder accounts) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, IOException {
        Cipher cipher=Cipher.getInstance("RSA");
        KeyPairGenerator pairGen=KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair=pairGen.generateKeyPair();
        Key publicKey = keyPair.getPublic();
        privateKey=keyPair.getPrivate();
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        FileOutputStream fileOutputStream=new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\metanit\\authentication\\"+"file2");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        byte[] bytes=cipher.doFinal(accounts.toString().getBytes());
        for (byte i:bytes) {
            objectOutputStream.write(i);
        }
        objectOutputStream.close();
    }

    public StringBuilder decode(byte[] accounts) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher descriptionCipher=Cipher.getInstance("RSA");
        descriptionCipher.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] bytes=descriptionCipher.doFinal(accounts);
        StringBuilder sb=new StringBuilder();
        for (byte i:bytes){
            sb.append((char) i);
        }
        return sb;
    }
}
