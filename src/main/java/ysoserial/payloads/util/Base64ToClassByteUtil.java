package ysoserial.payloads.util;

import javax.xml.bind.DatatypeConverter;

/**
 * @author UzJu
 * @date 2025/2/17
 * @Site UzzJu.com
 * @Comment :)
 */
public class Base64ToClassByteUtil {
    public static byte[] base64ToBytes(String base64Str) {
        if (base64Str == null || base64Str.isEmpty()) {
            return new byte[0];
        }
        return DatatypeConverter.parseBase64Binary(base64Str);
    }
}
