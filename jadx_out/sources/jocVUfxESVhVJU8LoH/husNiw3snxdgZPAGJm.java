package jocVUfxESVhVJU8LoH;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm {
    public static String lEeR5KfoEr4xU5yHH7(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
