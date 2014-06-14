// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package genitalico.cifradocesar.encrypted;


public class ValidacionAlfanumerica
{

    private byte valido;

    public ValidacionAlfanumerica()
    {
        valido = 0;
    }

    public byte getValido()
    {
        return valido;
    }

    public void setValido(char c)
    {
        valido = 0;
        if (c >= '0' && c <= '9')
        {
            valido = 1;
        }
        if (c >= 'a' && c <= 'z')
        {
            valido = 2;
        }
        if (c >= 'A' && c <= 'Z')
        {
            valido = 3;
        }
    }
}
