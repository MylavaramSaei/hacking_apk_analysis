package com.example.fcmexpr.keepalive;

import android.content.Context;
import android.util.Log;
import com.example.fcmexpr.App;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class G7AC3DWIx9i9fdanjk {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Context f4720lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final File f4721s3fjYDxWOUexjjVgyA;

    static {
        Context context = null;
        String str = "۫ۛۘۘۧۚۦۘۥۢۗۜۗ۫۫ۚۖۘ۫ۢۙ۫ۦۛۤۚۥۨۨۤۥۘۨۘۨۛۜۤۖۘۖۜۛ۫ۧۗ";
        while (true) {
            switch ((((str.hashCode() ^ 192) ^ 277) ^ 857) ^ (-1638979203)) {
                case -536410382:
                    f4720lEeR5KfoEr4xU5yHH7 = context;
                    str = "ۖۡۙۜۜۘۘۙۛۚۥۡۦۛ۫ۛۛۚۜۜۡۙۨۡۨۘۙۗۖۘۛۙۚۜ۬۠۟ۖۢۙۨۧۘۡۛۖۘ";
                    break;
                case 87277785:
                    return;
                case 676274457:
                    f4721s3fjYDxWOUexjjVgyA = new File(context.getFilesDir(), "report.txt");
                    str = "ۜۧ۠ۜۜۧۘ۠ۙۡۗۚۦۙۨۖۘۗۢۥۖۨۖۜ۠ۘۘۙ۟ۜ۟ۗ۫ۛۤۖۘۤۚۦ";
                    break;
                case 1998450116:
                    context = App.f4719lEeR5KfoEr4xU5yHH7;
                    str = "۬۟ۘۡۨۨۘ۟ۗ۟ۚۚ۟ۖۢۧ۬ۢۘۚۤۢ۟۫ۡ۫ۡۘ۫ۘۥۚۡۧۘۜۤۗۖۙۤۡۡۖۘۡ۬ۢ۫ۦۛ";
                    break;
            }
        }
    }

    public static void HJFh0TGMpafqLE9haL() throws JSONException, IOException {
        String string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            FileInputStream fileInputStream = new FileInputStream(f4721s3fjYDxWOUexjjVgyA.getAbsolutePath());
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    String str = "ۢۙۦۦۥۨۘۢۚ۫ۘۦۙ۠ۖۜۜ۠ۖۘۗۗۧۡۢۘۘۥۤۙ۟۟ۖۘ۟ۥۨۘۘۜۤۚ۬ۘۘۜ۬ۢۖۚۦۢۧۖۘۗ۬۟ۘۖ";
                    while (true) {
                        switch (str.hashCode() ^ 1904488344) {
                            case -1958859794:
                                str = "ۜۡۡۘۥۖۨۘ۠۬ۜۛ۟ۜۛۧۥ۠ۨۖۥۘۖۜۜۘ۟ۤۚۦۙۘ";
                                break;
                            case -1217946553:
                                break;
                            case -433711735:
                                fileInputStream.close();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                String str2 = "ۖۚۘۧۚۘۡۧۨۘۘ۟ۖۘ۟۬ۚۤۜۘۢۢۖۘۚۢۢۙۚۨۘ۟ۨۜۥۢۖۗۙ۫ۧۖۧۡ۫۠۟۟ۡ۫۠ۥۘۙۡ۬ۧ۫ۢ";
                                while (true) {
                                    switch (str2.hashCode() ^ (-848352717)) {
                                        case -1540478937:
                                            Log.i("MiningTracker", "empty report, return");
                                            return;
                                        case 37810107:
                                            String str3 = "ۨۙۦۘۗۛۚۤۢۘۘۦۗۦۦۢۧ۬ۜۘۧۧۖۘ۟ۗ۬ۢۛۚۨۥۢۨ۫ۢۙۨۦۘ";
                                            while (true) {
                                                switch (str3.hashCode() ^ 697521724) {
                                                    case -2111112389:
                                                        str3 = "ۚۢۘۚ۫ۖۢ۬ۥۨۡ۠ۛۜۘۢۛۘۘۗۙۘۘ۟ۨۨۢۤۥۤ۬ۗۡۥۥ۠ۤۜۤۘۚۜۚۡۧۛۨ۬ۢ";
                                                        break;
                                                    case -2054687081:
                                                        if (byteArray.length != 0) {
                                                            str3 = "ۜۖۚ۠ۘۧۖۛۙۡ۬ۤ۬۟ۙۚۛ۟ۘۘۧۘ۟ۙۡۘۙۨۜۚ۠ۨۘ";
                                                            break;
                                                        } else {
                                                            str3 = "ۢۡۥۦۖۤ۬ۖۜۘۧۥ۠ۙۖۗۘ۟۟ۙۤۖۘۛۥۨۘۚۤۧ۬ۢۧ";
                                                            break;
                                                        }
                                                    case 406223488:
                                                        str2 = "ۚۖۘۗۡۚۛۙۥۘۥۦۧۜۘۘۢۤۦۚ۠۠ۤۜۙۜ۠ۥ۬ۦۨ";
                                                        continue;
                                                    case 1677393193:
                                                        str2 = "ۨۨۖۧ۟ۗۧۤۥۛۗۚۚۗ۟ۢۘۗۥۖۗۢۧۛۤۦۙۖ۫ۜ۬ۦۢۚۥ۫";
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1748317189:
                                            try {
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://aptabase.uasecurity.org:8443/logging/try_uploading?size=" + byteArray.length).openConnection();
                                                String str4 = "ۢۨۡۘۥۘۛ۬ۢۘۘۘۥۧۦ۬ۚۛۤۜۨۙۦۧۧ۫ۨۘۛۚ۠ۨ";
                                                while (true) {
                                                    switch (str4.hashCode() ^ 1015862961) {
                                                        case -1917690667:
                                                            str4 = "ۗۗۘۘۢ۠۬۟ۥۖۘۛۜۜۘۛۙۥۘۘ۟ۖۙۧۤۘۦ۠ۧ۠ۨۘۦۡۨۘۚۡۦۘۘۡۧۘۜۙۤۖۗۖ";
                                                            break;
                                                        case -247992684:
                                                            String str5 = "ۧۦۦۖ۬ۜۗۖ۬ۘ۫۟ۡۧۘۧۥۦۨ۫ۨۨۙۥۧۘ۫ۧۨۡۘۥۘ۬۠۫ۘۘ۫ۧۛۦ۟ۜۘۢۨۧۜ۟ۦۘ۬ۗۚ۟ۗۚ";
                                                            while (true) {
                                                                switch (str5.hashCode() ^ 226442480) {
                                                                    case -1830689870:
                                                                        str4 = "ۥۥۖۘۨۨۧۗۜۨۘۦۙۡۘۛ۟ۖۢۡۧۘۗۦۘۘ۠ۖۘۦۗ۠ۤۤۛۙۗ۠۟ۙۡ۬ۢۦۘ۠ۖۦ۟۟ۗ۟ۥۧ";
                                                                        continue;
                                                                    case -976170982:
                                                                        if (httpURLConnection.getResponseCode() != 200) {
                                                                            str5 = "ۨ۬ۦ۫ۘ۬۠ۡۛۖۙۘۘۙ۟ۨۙۗۘۘۜۦۦۛۥۚۥۢۧۧۦۘۥۡۘۘۤۢ۬۬ۨۡۘۢ۬ۜۧ۬ۦۖۜۡۘۗ۫ۦۚۡۡۘ";
                                                                            break;
                                                                        } else {
                                                                            str5 = "ۧۤۤۨۘ۟ۢۨ۟ۗۧۨۘۤۜۥۘۧۤۦۘ۟ۚۦۘۚۦۚۥۧۗۡۙۘ۠ۨ۟ۘۨۘۢۖۨۧۢۘۥۖۚۚ۫ۚۖ۫ۘۚ";
                                                                            break;
                                                                        }
                                                                    case -146061118:
                                                                        str5 = "ۖۦۖ۬ۤۘۘۖۜۥۘ۠۫۟ۤۜۨۖۜۥۙۛۡۘۨ۠۟ۡۧ۠ۥۙۧ۟ۚۚۥۖۛۗ۠ۦۧۜۘ";
                                                                        break;
                                                                    case 1931455036:
                                                                        str4 = "ۤۥۖۘۚۦۙۤۡۥۖۥۘۧ۟ۖۘۦۘۘۡ۠ۥ۠ۚۡۘۡۧۦۘۙۢ۠۠ۥۖۘۚ۠ۜۚۘۘۘۥۦۥۘۨۙ۬۠۬ۢۜۙۦۖۤ";
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 810452781:
                                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                            InputStream inputStream = httpURLConnection.getInputStream();
                                                            byte[] bArr2 = new byte[1024];
                                                            while (true) {
                                                                int i2 = inputStream.read(bArr2);
                                                                String str6 = "۠ۗۥۘۘۧ۠ۚۚ۬ۥۗۦۜ۠ۢۛۧۚۖۚۢۖۘ۠ۧۘۙۤۢۖۘ";
                                                                while (true) {
                                                                    switch (str6.hashCode() ^ 558793680) {
                                                                        case -1246041374:
                                                                            String str7 = new String(byteArrayOutputStream2.toByteArray(), StandardCharsets.UTF_8);
                                                                            Log.v("MiningTracker", "response is " + str7);
                                                                            JSONObject jSONObject = new JSONObject(str7);
                                                                            String str8 = "ۤ۬ۖۤۥۡۘۛۚ۬ۢۖۦۤۧۥۘ۟۬ۘۘۦۗۜۨۥۜ۟۬۬ۨ۫ۥ۠ۡۢۢۨۚۛۖۡۡ۟ۥۘۘۧۖۘۥۦۧۨۥۡۘ۠ۚ۠";
                                                                            while (true) {
                                                                                switch (str8.hashCode() ^ (-28344831)) {
                                                                                    case -1541272845:
                                                                                        str8 = "ۙۦ۫ۥۗۤۙۨ۠ۦۗۥۘۤ۬ۡۘ۫ۨۘۘ۫ۜۦۘ۟۠۫۠۫ۘۢۡۥۘۘۛ۫۟ۦ۠";
                                                                                        continue;
                                                                                    case -896585256:
                                                                                        string = null;
                                                                                        break;
                                                                                    case 523544829:
                                                                                        String str9 = "ۘۨۛۢۢۨۘۖۛۥ۠۠ۜۦۘۘۚۗۡۘ۫ۙ۠ۘ۠ۧۖ۫ۜۚۡۡ۟ۦۘۤۦۥۘۥۘۨ۠ۨۦۘۚۛۢۖۢۢ";
                                                                                        while (true) {
                                                                                            switch (str9.hashCode() ^ (-1441714)) {
                                                                                                case -1979115697:
                                                                                                    if (!jSONObject.getBoolean("allowed")) {
                                                                                                        str9 = "۠ۙۨۘ۫ۗۜ۠ۙۦۘۡۗۢۖۤ۬۫ۘۘۚۢۢۡۛۚۖۥۘۥ۠ۛۛ۟۫ۖ۬ۢ";
                                                                                                        break;
                                                                                                    } else {
                                                                                                        str9 = "ۜ۟ۥۡۘۚۛۗۡۦ۬۬۟ۙۨۘ۫ۛۚ۟۫ۘۖۥۧۛۡ۬ۛ۟ۚۧ۟ۚۡ۠۠ۜ۟ۥۗۨۗۗ۠ۧۙۧۘۡۘۘ۫ۘ";
                                                                                                        break;
                                                                                                    }
                                                                                                case -884115309:
                                                                                                    str8 = "ۚۨۧۗۛۥ۠ۚۘۦۢۜۘۛۥ۫ۘۨۡۧۥۧۧ۟ۡۚ۟ۥۘۚۤۘۗۘۢۜۚۙ";
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case -766405109:
                                                                                                    str9 = "ۦۗ۫ۦ۠ۜۘۨۡ۟ۜۚۢ۫ۢۘۦ۬ۡ۫۟ۖ۫ۤۙ۬ۧۨ۟ۛ۫ۦۘۗۢۗۛۧۘۨ۫ۘۘ";
                                                                                                    break;
                                                                                                case 1133196295:
                                                                                                    str8 = "۬ۥۨۘ۫۫ۘۘ۠ۡۢۥ۟ۢۖ۬ۛ۫ۗۡۘۘۚۥ۠۠۬ۨ۟ۦۙ۠۬۫۬ۖۚۘۡۚۢۤۗۗۜۘۘۦۗۛ۫ۥۘ";
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 2093534407:
                                                                                        string = jSONObject.getString("url");
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            httpURLConnection.disconnect();
                                                                            String str10 = "ۖۛۙۢۖۥۢ۫ۜۘۙۘۢۧۥۦ۟ۛ۠۫ۦۘۘ۬ۦۗۖۜۘۘۧۡۖۖۖۜۘۥۘ۟ۤۖۘۘۦۨۘۨ۠ۢ۬ۛۢۦۙۗۢ۠ۜ";
                                                                            while (true) {
                                                                                switch (str10.hashCode() ^ 1619088183) {
                                                                                    case -1157469807:
                                                                                        str10 = "ۙۧۤۜۦۦۖۡۜۘۤۦۨۘۚۘۛۙ۬ۦۘۛ۬ۨۘۧۦۗ۫ۨۥۘۥ۫ۡۘ";
                                                                                        break;
                                                                                    case -681010913:
                                                                                        String str11 = "ۚۥۚۥۧۗۤ۠ۡۘۛۨۨۘۗۧۥۚۛۡۘ۫ۡۨۡۦ۬ۧۘۖۥۨۚ";
                                                                                        while (true) {
                                                                                            switch (str11.hashCode() ^ (-1657427766)) {
                                                                                                case -1716430951:
                                                                                                    str10 = "۫ۖ۠ۢۖۨۤۦۤۤ۠ۗۙۤۚۡۖۢۜۙۡۘۙۥۦۙ۟ۤۥ۬ۢۚ۟ۘۡۗۜۘۛۖۥۘ";
                                                                                                    continue;
                                                                                                case 398576532:
                                                                                                    if (string != null) {
                                                                                                        str11 = "ۛۢۢ۬ۘۜۘۖۖۤۧۡۖۘۗۗۢ۬ۦ۫۠ۙۨۘۘ۠ۧۗ۬ۤ۠ۧۘۛۨۦۘۖۤۢۗۙۢ";
                                                                                                        break;
                                                                                                    } else {
                                                                                                        str11 = "۠ۙ۬ۗۗۦۘۡۤ۟ۚ۟ۜۘۖ۫ۙۢ۫ۙۥۥۖۛۥۛۦۚۡۧۘۨ۬ۙۦۘ۫ۨۨۘۚۚۘۘ۫ۧۡۖۜ۫ۦۚۨۘۤۛۙۨۤۖ";
                                                                                                        break;
                                                                                                    }
                                                                                                case 1128495995:
                                                                                                    str11 = "ۖۘۗۧۖ۫۠ۙۙۥۚۗۥ۫ۚۘۖ۟ۗۙ۟ۤۦۥۡۨۢۦۢ۟ۛۛۘۘۧ۠ۚ۟۟ۗۘ۫ۖۘ۫ۧۘۘۦۖۖۚۚۥۙۤۨ";
                                                                                                    break;
                                                                                                case 1749202909:
                                                                                                    str10 = "ۥ۫۠ۥۗۜۤۗۘۗۢۘۚۨۦۘ۟ۡۨۜۦۙۢۦۘۧۨۧۧۙۛۖۤۚۡۧۡۘۖۖۦۘ۠ۡۨ۠ۗۖۘۚۖۧ";
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 1443683030:
                                                                                        Log.i("MiningTracker", "uploading disabled, discarding current log");
                                                                                        lEeR5KfoEr4xU5yHH7();
                                                                                        return;
                                                                                    case 2052437351:
                                                                                        Log.v("MiningTracker", string);
                                                                                        try {
                                                                                            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(string).openConnection();
                                                                                            httpURLConnection2.setRequestMethod("PUT");
                                                                                            httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(byteArray.length));
                                                                                            httpURLConnection2.setDoOutput(true);
                                                                                            httpURLConnection2.getOutputStream().write(byteArray);
                                                                                            httpURLConnection2.getOutputStream().close();
                                                                                            int responseCode = httpURLConnection2.getResponseCode();
                                                                                            String str12 = "ۤ۟ۧۤۢۦۘۦۡۜ۫ۡۥۘ۠ۧۜۙ۬ۡۤۨۢۡۧۤ۬ۜۜۘۦۡ۫ۙۨۧۗۗۘۘ";
                                                                                            while (true) {
                                                                                                switch (str12.hashCode() ^ 578710736) {
                                                                                                    case -1767909237:
                                                                                                        String str13 = "ۧۗۧۢ۠ۡۘۡۡۦۘۨۖۜۚۧۧۧ۬ۨۘۡ۬ۡۗۧۨۛۨۗۘ۫ۛ۬۬۫ۖۤۦۗ۫ۛۛ۬ۘ";
                                                                                                        while (true) {
                                                                                                            switch (str13.hashCode() ^ (-179622782)) {
                                                                                                                case -601679717:
                                                                                                                    str13 = "ۤۛۖۤۦۘۢ۫ۢ۠ۡۡۗۡۖۘ۫ۙ۠ۧۛۜۙۙۙ۠ۢۙ۠ۜۨۘۨۛۦۘۖ۬ۗۘۘۢ۟ۛ";
                                                                                                                    break;
                                                                                                                case -545313234:
                                                                                                                    str12 = "۠ۛۢۗۥۘ۠ۥۖۘۖۙ۬ۜ۟ۨۗۘۙ۠ۡۨۗۘۙۤۦ۬ۖۙۙۥۧۖۘۦۜ۬ۙ۠ۛۥۥۘ۫ۖ۬ۗۜۚ";
                                                                                                                    continue;
                                                                                                                case -320867922:
                                                                                                                    if (responseCode != 200) {
                                                                                                                        str13 = "ۢ۫ۡۥۜۡۜ۫ۛ۫ۖۨۘۢۤۗ۬ۤ۟ۛۥ۬ۚۘۖ۬ۖۖۜۖۡۘ۟ۘ۫ۛ۠۫";
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        str13 = "۟ۖۙۧۨ۟ۥۛۖۘۦ۬ۡ۬ۙۖۘۜۥۢۦۜۘۙۧۧۛ۟۟ۥۘۘۙۗۥ۠ۘۥۖۢۢ۫ۦۘ۬ۡۨۘۖ۫ۤ";
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case -50721642:
                                                                                                                    str12 = "ۧ۫ۙۧۗۥ۠۬ۗ۫ۘۦۡۙۨۘۧۦۦۘۡۤۦۗۧۢۤۡۗ۬ۧۘۜۘۨۦ۫ۜۡۡ۟ۙ۟";
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case -1209135663:
                                                                                                        throw new IOException("non 200 response code: " + responseCode);
                                                                                                    case -68317877:
                                                                                                        str12 = "ۙۛۜۘ۠ۦۨ۟ۛۘۙۙ۬ۛ۠ۢۤۜۦۘۜۛۥۘ۟ۚۡۛۧۡۘۤۗۗۙ۟ۡۦۧۜۘۖۗۖۙ۬ۨۘ۠ۥۡۘۚۥۗ";
                                                                                                        break;
                                                                                                    case 1865665312:
                                                                                                        httpURLConnection2.disconnect();
                                                                                                        Log.i("MiningTracker", "upload successfully");
                                                                                                        lEeR5KfoEr4xU5yHH7();
                                                                                                        return;
                                                                                                }
                                                                                            }
                                                                                        } catch (IOException e) {
                                                                                            Log.e("MiningTracker", "uploading failed: " + e);
                                                                                            return;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case -317501055:
                                                                            str6 = "ۧۚۜۧۧۨۘۘۙۙۦۡ۫ۛۖ۟ۜۡ۠۬۬ۨۢۨۧۘۧۖۥۨ۠ۚۡۛۧۥۘۘۘ";
                                                                            break;
                                                                        case 603467961:
                                                                            String str14 = "ۦۜۤ۟ۚ۟ۧ۟ۡۘۘۧ۬ۥۚ۠ۨۡۙۨۗۖ۟ۘۘۖۖۖۘ۠ۧۥۘ";
                                                                            while (true) {
                                                                                switch (str14.hashCode() ^ 1992150348) {
                                                                                    case -1058809185:
                                                                                        str6 = "۬۬ۢۖۧۥۘۙۛۜۢۥ۬ۤۜ۟ۥۙ۫ۛۧۨ۟ۧۧۢۡۧۧۖ۠";
                                                                                        break;
                                                                                    case 379835789:
                                                                                        str14 = i2 != -1 ? "ۧۦ۟ۙ۟۟ۧۧۜۘۥۙۤۛۖۘۛ۟ۤۡۗۡۘۘۤۨۘۡ۫ۤۨ۫ۘ۬ۨۗۛ۠ۘۘۙۛ۬ۛۛۜۘ" : "ۢۛ۫۫ۢۥۘۡۡۚۦۙۨۘۖۛۡۘۥۡۘۜۖۧۘ۬ۛۢ۟۟ۧۚ۠ۦۙۤ۟ۤۦۘ۬ۢۚۙۚۗ۫ۢۚۡۘ";
                                                                                    case 1008337028:
                                                                                        str14 = "۫ۧۖۘۚ۫ۦ۟ۖۚ۫ۙۥۛۚۜۛۥۛ۫۬۟ۜ۬ۨۘۡۚۚۨۤۖۘۛۦ۫ۖۛۡۘ۫ۜۜۧۛۡۘۙۗۡۘ۬ۡۛۨۥۨۨۗۖ";
                                                                                    case 2072589928:
                                                                                        str6 = "ۛۗۘۘۗۦ۬ۢ۫ۚ۬ۛۖۘۙۗۛ۠ۡۜۛ۠ۢ۟ۜۘ۬ۡۨۘ۫ۛ۬۫ۗۦۘۢۛۦۧۘ۟ۗۤۘ";
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1365119917:
                                                                            break;
                                                                    }
                                                                }
                                                                byteArrayOutputStream2.write(bArr2, 0, i2);
                                                            }
                                                            break;
                                                        case 1613837885:
                                                            throw new IOException("non success code: " + httpURLConnection.getResponseCode());
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                Log.e("MiningTracker", "failed to get upload config report: " + e2);
                                                return;
                                            }
                                            break;
                                        case 1890886158:
                                            str2 = "۬ۥ۫ۧۛۙۛۙۗۖ۠ۚۛۖۥۘ۫ۗۦۘۡۛۦۘۜۗۧۙۦۖۥۗ۬ۨۨۜۛۧۦۘۤۦۛۢۘۙۨۖۡۘۡۤۦ۫ۢۜۙۦۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 188934503:
                                String str15 = "ۙۛۥۘۡۦۤۡ۟ۙۥۡۤۛۚۦۘ۟ۦ۠ۡ۬ۜ۟ۧۘۘۗ۬ۖۘۗۛۧۙ۟ۘۘۢۦۧۘۜ۬ۙ۟ۜۨۥۗۡۤۛۢ۟۬ۤۚ";
                                while (true) {
                                    switch (str15.hashCode() ^ 791488578) {
                                        case -825050770:
                                            str = "ۙۡ۫۬ۖۥۘ۟۟ۦۘۡ۫ۦۘ۫ۘۜۘۧۨۥۘۘۧۘۛ۟ۗۛۢۘۜ۠ۖ";
                                            break;
                                        case -460621200:
                                            str15 = "ۛۦۙۥ۟ۥۘۤۨۢۤۥۡۘۙۦۙۙۦۜۘۡۡۢۨۜۢ۫ۡۚۗۧۢۙ۠ۥۛۧۢ";
                                        case 1342331810:
                                            str15 = i != -1 ? "ۙ۠ۘۘ۟۠ۢۙۥۘۘۤۛۚۨۥۘۧۧۥۘۨۨۧۘۚۤۡۘۢ۬ۤۥۤۤ۫ۢۦۘۙۢۢۖۖۧۚۡ۬ۧ۫ۡۖ۫" : "۫ۛ۬ۤۨۘۧۢ۠ۖۧۘ۟ۜ۠۫ۖۨۘ۠۬ۙۨ۬ۗ۬ۜۘ۠ۦ";
                                        case 1662345862:
                                            str = "ۚ۬ۢۖۡۙۜ۬ۥۘۘۘۖۘۡۤۘۢۖۥۢ۠ۥ۟۬ۡۛۖۜۚۖۨۤۚۦۥ۟ۤ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (IOException e3) {
            Log.e("MiningTracker", "reading report: " + e3);
        }
    }

    public static void lEeR5KfoEr4xU5yHH7() throws IOException {
        try {
            new FileOutputStream(f4721s3fjYDxWOUexjjVgyA.getAbsolutePath()).close();
        } catch (Exception e) {
            Log.e("MiningTracker", "Preparing... " + e);
        }
    }

    public static void s3fjYDxWOUexjjVgyA(String str) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(f4721s3fjYDxWOUexjjVgyA.getAbsolutePath(), true);
            try {
                PrintWriter printWriter = new PrintWriter(fileOutputStream);
                try {
                    printWriter.println(str);
                    printWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            Log.e("MiningTracker", "Record: " + e);
        }
    }
}
