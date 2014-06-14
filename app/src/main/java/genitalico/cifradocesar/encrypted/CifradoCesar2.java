// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package genitalico.cifradocesar.encrypted;


// Referenced classes of package com.ochentabits.cifradocesar.app.encrypted:
//            ValidacionAlfanumerica

public class CifradoCesar2
{

    private String textocifrado;

    public CifradoCesar2()
    {
        textocifrado = "";
    }

    public String getCifrar()
    {
        return textocifrado;
    }

    public void setCifrar(String s, int i)
    {
        textocifrado = "";
        char ac[] = s.toCharArray();
        ValidacionAlfanumerica validacionalfanumerica = new ValidacionAlfanumerica();
        for (int j = 0; j < ac.length; j++)
        {
            validacionalfanumerica.setValido(ac[j]);
            if (validacionalfanumerica.getValido() == 1)
            {
                textocifrado = (new StringBuilder()).append(textocifrado).append((char)(48 + (i + (-48 + ac[j])) % 10)).toString();
            }
            if (validacionalfanumerica.getValido() == 2)
            {
                textocifrado = (new StringBuilder()).append(textocifrado).append((char)(97 + (i + (-97 + ac[j])) % 26)).toString();
            }
            if (validacionalfanumerica.getValido() == 3)
            {
                textocifrado = (new StringBuilder()).append(textocifrado).append((char)(65 + (i + (-65 + ac[j])) % 26)).toString();
            }
            if (validacionalfanumerica.getValido() == 0)
            {
                textocifrado = (new StringBuilder()).append(textocifrado).append(ac[j]).toString();
            }
        }

    }
}
