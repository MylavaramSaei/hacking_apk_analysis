package zXY7dgnTfw9Pd9RXel;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public abstract class hoXrIDAFrSwfShk8da {
    public static hoXrIDAFrSwfShk8da lEeR5KfoEr4xU5yHH7(long j) {
        return new IPyIQcaNa8aB7drBED(j);
    }

    public static hoXrIDAFrSwfShk8da s3fjYDxWOUexjjVgyA(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? lEeR5KfoEr4xU5yHH7(Long.parseLong(jsonReader.nextString())) : lEeR5KfoEr4xU5yHH7(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long HJFh0TGMpafqLE9haL();
}
