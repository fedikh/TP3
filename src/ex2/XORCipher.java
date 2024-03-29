
package ex2;

public class XORCipher {
    private String key ;
    public XORCipher(String key) {
        this.key = key;
    }
   public String encrypt(String plaintext) {
        StringBuilder T = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char plainCh = plaintext.charAt(i);
            char keyCh = this.key.charAt(i % this.key.length());
            char Ch = (char) (plainCh ^ keyCh);
            T.append(Ch);
        }
        return T.toString();
    } 
    public String decrypt(String ciphertext) {
        StringBuilder   D = new StringBuilder();
        for (int i = 0; i < ciphertext.length(); i++) {
            char cipherChar = ciphertext.charAt(i);
            char keyCh = this.key.charAt(i % this.key.length());
            char dCh = (char) (cipherChar ^ keyCh);
            D.append(dCh);
        }
        return D.toString();
    }
    
    
}
