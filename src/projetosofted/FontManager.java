/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosofted;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

/**
 *
 * @author HD
 */
public class FontManager {
    public Font carregarFonte(String pCaminhoFonte, int tipoFonte, int pTamanhoFonte){
        Font minhaFonte = null;
        
        try{
            minhaFonte = Font.createFont(Font.TRUETYPE_FONT, 
                    getClass().getResourceAsStream(pCaminhoFonte)).deriveFont(tipoFonte, pTamanhoFonte);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(FontFormatException ex){
            ex.printStackTrace();
        }
        return minhaFonte;
    }
}
