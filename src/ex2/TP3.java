
package ex2;

public class TP3 {
  public static void main(String[] args) {
        // Clé de chiffrement
        String key = "secret";
        // Texte clair à chiffrer
        String plaintext = "Hello, world";
        // Création de l’objet XORCipher
        XORCipher xorCipher = new XORCipher(key);
        // Chiffrement du texte clair
        String encryptedText = xorCipher.encrypt(plaintext);
        System.out.println("Texte chiffré : " + encryptedText);
        // Déchiffrement du texte chiffré
        String decryptedText = xorCipher.decrypt(encryptedText);
        System.out.println("Texte déchiffré : " + decryptedText);
    }
    
    
    
}
