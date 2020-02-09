package com.jmal.clouddisk.util;

import java.util.HashMap;
import java.util.Map;

/**
 * FileContentTypeUtils
 *
 * @blame jmal
 */
public class FileContentTypeUtils {

    public static void main(String[] args){
        System.out.println(getContentType(".PPTx"));
    }

    /**
     * 根据文件后缀类型获取文件Content-Type
     * @param ext
     * @return
     */
    public static String getContentType(String ext) {
        String value = contentType.get(ext.toLowerCase());
        if(value != null && value.length() > 0){
            return value;
        }else {
            return "application/octet-stream";
        }
    }

    /**
     * 两种初始化Map常量
     * 1.new HashMap
     * 2.static 静态代码块
     */
    private static Map<String , String> contentType = new HashMap<String , String>(){
        {
            put("jpg","image/jpeg");
            put("jpeg","image/jpeg");
        }
    };
    static {
        contentType.put("apk","application/vnd.android.package-archive");
        contentType.put("load" , "text/html");
        contentType.put("123" , "application/vnd.lotus-1-2-3");
        contentType.put("3ds" , "image/x-3ds");
        contentType.put("3g2" , "video/3gpp");
        contentType.put("3ga" , "video/3gpp");
        contentType.put("3gp" , "video/3gpp");
        contentType.put("3gpp" , "video/3gpp");
        contentType.put("602" , "application/x-t602");
        contentType.put("669" , "audio/x-mod");
        contentType.put("7z" , "application/x-7z-compressed");
        contentType.put("a" , "application/x-archive");
        contentType.put("aac" , "audio/mp4");
        contentType.put("abw" , "application/x-abiword");
        contentType.put("abw.crashed" , "application/x-abiword");
        contentType.put("abw.gz" , "application/x-abiword");
        contentType.put("ac3" , "audio/ac3");
        contentType.put("ace" , "application/x-ace");
        contentType.put("adb" , "text/x-adasrc");
        contentType.put("ads" , "text/x-adasrc");
        contentType.put("afm" , "application/x-font-afm");
        contentType.put("ag" , "image/x-applix-graphics");
        contentType.put("ai" , "application/illustrator");
        contentType.put("aif" , "audio/x-aiff");
        contentType.put("aifc" , "audio/x-aiff");
        contentType.put("aiff" , "audio/x-aiff");
        contentType.put("al" , "application/x-perl");
        contentType.put("alz" , "application/x-alz");
        contentType.put("amr" , "audio/amr");
        contentType.put("ani" , "application/x-navi-animation");
        contentType.put("anim[1-9j]" , "video/x-anim");
        contentType.put("anx" , "application/annodex");
        contentType.put("ape" , "audio/x-ape");
        contentType.put("arj" , "application/x-arj");
        contentType.put("arw" , "image/x-sony-arw");
        contentType.put("as" , "application/x-applix-spreadsheet");
        contentType.put("asc" , "text/plain");
        contentType.put("asf" , "video/x-ms-asf");
        contentType.put("asp" , "application/x-asp");
        contentType.put("ass" , "text/x-ssa");
        contentType.put("asx" , "audio/x-ms-asx");
        contentType.put("atom" , "application/atom+xml");
        contentType.put("au" , "audio/basic");
        contentType.put("avi" , "video/x-msvideo");
        contentType.put("aw" , "application/x-applix-word");
        contentType.put("awb" , "audio/amr-wb");
        contentType.put("awk" , "application/x-awk");
        contentType.put("axa" , "audio/annodex");
        contentType.put("axv" , "video/annodex");
        contentType.put("bak" , "application/x-trash");
        contentType.put("bcpio" , "application/x-bcpio");
        contentType.put("bdf" , "application/x-font-bdf");
        contentType.put("bib" , "text/x-bibtex");
        contentType.put("bin" , "application/octet-stream");
        contentType.put("blend" , "application/x-blender");
        contentType.put("blender" , "application/x-blender");
        contentType.put("bmp" , "image/bmp");
        contentType.put("bz" , "application/x-bzip");
        contentType.put("bz2" , "application/x-bzip");
        contentType.put("c" , "text/x-csrc");
        contentType.put("c++" , "text/x-c++src");
        contentType.put("cab" , "application/vnd.ms-cab-compressed");
        contentType.put("cb7" , "application/x-cb7");
        contentType.put("cbr" , "application/x-cbr");
        contentType.put("cbt" , "application/x-cbt");
        contentType.put("cbz" , "application/x-cbz");
        contentType.put("cc" , "text/x-c++src");
        contentType.put("cdf" , "application/x-netcdf");
        contentType.put("cdr" , "application/vnd.corel-draw");
        contentType.put("cer" , "application/x-x509-ca-cert");
        contentType.put("cert" , "application/x-x509-ca-cert");
        contentType.put("cgm" , "image/cgm");
        contentType.put("chm" , "application/x-chm");
        contentType.put("chrt" , "application/x-kchart");
        contentType.put("class" , "application/x-java");
        contentType.put("cls" , "text/x-tex");
        contentType.put("cmake" , "text/x-cmake");
        contentType.put("cpio" , "application/x-cpio");
        contentType.put("cpio.gz" , "application/x-cpio-compressed");
        contentType.put("cpp" , "text/x-c++src");
        contentType.put("cr2" , "image/x-canon-cr2");
        contentType.put("crt" , "application/x-x509-ca-cert");
        contentType.put("crw" , "image/x-canon-crw");
        contentType.put("cs" , "text/x-csharp");
        contentType.put("csh" , "application/x-csh");
        contentType.put("css" , "text/css");
        contentType.put("cssl" , "text/css");
        contentType.put("csv" , "text/csv");
        contentType.put("cue" , "application/x-cue");
        contentType.put("cur" , "image/x-win-bitmap");
        contentType.put("cxx" , "text/x-c++src");
        contentType.put("d" , "text/x-dsrc");
        contentType.put("dar" , "application/x-dar");
        contentType.put("dbf" , "application/x-dbf");
        contentType.put("dc" , "application/x-dc-rom");
        contentType.put("dcl" , "text/x-dcl");
        contentType.put("dcm" , "application/dicom");
        contentType.put("dcr" , "image/x-kodak-dcr");
        contentType.put("dds" , "image/x-dds");
        contentType.put("deb" , "application/x-deb");
        contentType.put("der" , "application/x-x509-ca-cert");
        contentType.put("desktop" , "application/x-desktop");
        contentType.put("dia" , "application/x-dia-diagram");
        contentType.put("diff" , "text/x-patch");
        contentType.put("divx" , "video/x-msvideo");
        contentType.put("djv" , "image/vnd.djvu");
        contentType.put("djvu" , "image/vnd.djvu");
        contentType.put("dng" , "image/x-adobe-dng");
        contentType.put("doc" , "application/msword");
        contentType.put("docbook" , "application/docbook+xml");
        contentType.put("docm" , "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        contentType.put("docx" , "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        contentType.put("dot" , "text/vnd.graphviz");
        contentType.put("dsl" , "text/x-dsl");
        contentType.put("dtd" , "application/xml-dtd");
        contentType.put("dtx" , "text/x-tex");
        contentType.put("dv" , "video/dv");
        contentType.put("dvi" , "application/x-dvi");
        contentType.put("dvi.bz2" , "application/x-bzdvi");
        contentType.put("dvi.gz" , "application/x-gzdvi");
        contentType.put("dwg" , "image/vnd.dwg");
        contentType.put("dxf" , "image/vnd.dxf");
        contentType.put("e" , "text/x-eiffel");
        contentType.put("egon" , "application/x-egon");
        contentType.put("eif" , "text/x-eiffel");
        contentType.put("el" , "text/x-emacs-lisp");
        contentType.put("emf" , "image/x-emf");
        contentType.put("emp" , "application/vnd.emusic-emusic_package");
        contentType.put("ent" , "application/xml-external-parsed-entity");
        contentType.put("eps" , "image/x-eps");
        contentType.put("eps.bz2" , "image/x-bzeps");
        contentType.put("eps.gz" , "image/x-gzeps");
        contentType.put("epsf" , "image/x-eps");
        contentType.put("epsf.bz2" , "image/x-bzeps");
        contentType.put("epsf.gz" , "image/x-gzeps");
        contentType.put("epsi" , "image/x-eps");
        contentType.put("epsi.bz2" , "image/x-bzeps");
        contentType.put("epsi.gz" , "image/x-gzeps");
        contentType.put("epub" , "application/epub+zip");
        contentType.put("erl" , "text/x-erlang");
        contentType.put("es" , "application/ecmascript");
        contentType.put("etheme" , "application/x-e-theme");
        contentType.put("etx" , "text/x-setext");
        contentType.put("exe" , "application/x-ms-dos-executable");
        contentType.put("exr" , "image/x-exr");
        contentType.put("ez" , "application/andrew-inset");
        contentType.put("f" , "text/x-fortran");
        contentType.put("f90" , "text/x-fortran");
        contentType.put("f95" , "text/x-fortran");
        contentType.put("fb2" , "application/x-fictionbook+xml");
        contentType.put("fig" , "image/x-xfig");
        contentType.put("fits" , "image/fits");
        contentType.put("fl" , "application/x-fluid");
        contentType.put("flac" , "audio/x-flac");
        contentType.put("flc" , "video/x-flic");
        contentType.put("fli" , "video/x-flic");
        contentType.put("flv" , "video/x-flv");
        contentType.put("flw" , "application/x-kivio");
        contentType.put("fo" , "text/x-xslfo");
        contentType.put("for" , "text/x-fortran");
        contentType.put("g3" , "image/fax-g3");
        contentType.put("gb" , "application/x-gameboy-rom");
        contentType.put("gba" , "application/x-gba-rom");
        contentType.put("gcrd" , "text/directory");
        contentType.put("ged" , "application/x-gedcom");
        contentType.put("gedcom" , "application/x-gedcom");
        contentType.put("gen" , "application/x-genesis-rom");
        contentType.put("gf" , "application/x-tex-gf");
        contentType.put("gg" , "application/x-sms-rom");
        contentType.put("gif" , "image/gif");
        contentType.put("glade" , "application/x-glade");
        contentType.put("gmo" , "application/x-gettext-translation");
        contentType.put("gnc" , "application/x-gnucash");
        contentType.put("gnd" , "application/gnunet-directory");
        contentType.put("gnucash" , "application/x-gnucash");
        contentType.put("gnumeric" , "application/x-gnumeric");
        contentType.put("gnuplot" , "application/x-gnuplot");
        contentType.put("gp" , "application/x-gnuplot");
        contentType.put("gpg" , "application/pgp-encrypted");
        contentType.put("gplt" , "application/x-gnuplot");
        contentType.put("gra" , "application/x-graphite");
        contentType.put("gsf" , "application/x-font-type1");
        contentType.put("gsm" , "audio/x-gsm");
        contentType.put("gtar" , "application/x-tar");
        contentType.put("gv" , "text/vnd.graphviz");
        contentType.put("gvp" , "text/x-google-video-pointer");
        contentType.put("gz" , "application/x-gzip");
        contentType.put("h" , "text/x-chdr");
        contentType.put("h++" , "text/x-c++hdr");
        contentType.put("hdf" , "application/x-hdf");
        contentType.put("hh" , "text/x-c++hdr");
        contentType.put("hp" , "text/x-c++hdr");
        contentType.put("hpgl" , "application/vnd.hp-hpgl");
        contentType.put("hpp" , "text/x-c++hdr");
        contentType.put("hs" , "text/x-haskell");
        contentType.put("htm" , "text/html");
        contentType.put("html" , "text/html");
        contentType.put("hwp" , "application/x-hwp");
        contentType.put("hwt" , "application/x-hwt");
        contentType.put("hxx" , "text/x-c++hdr");
        contentType.put("ica" , "application/x-ica");
        contentType.put("icb" , "image/x-tga");
        contentType.put("icns" , "image/x-icns");
        contentType.put("ico" , "image/vnd.microsoft.icon");
        contentType.put("ics" , "text/calendar");
        contentType.put("idl" , "text/x-idl");
        contentType.put("ief" , "image/ief");
        contentType.put("iff" , "image/x-iff");
        contentType.put("ilbm" , "image/x-ilbm");
        contentType.put("ime" , "text/x-imelody");
        contentType.put("imy" , "text/x-imelody");
        contentType.put("ins" , "text/x-tex");
        contentType.put("iptables" , "text/x-iptables");
        contentType.put("iso" , "application/x-cd-image");
        contentType.put("iso9660" , "application/x-cd-image");
        contentType.put("it" , "audio/x-it");
        contentType.put("j2k" , "image/jp2");
        contentType.put("jad" , "text/vnd.sun.j2me.app-descriptor");
        contentType.put("jar" , "application/x-java-archive");
        contentType.put("java" , "text/x-java");
        contentType.put("jng" , "image/x-jng");
        contentType.put("jnlp" , "application/x-java-jnlp-file");
        contentType.put("jp2" , "image/jp2");
        contentType.put("jpc" , "image/jp2");
        contentType.put("jpe" , "image/jpeg");
        contentType.put("jpeg" , "image/jpeg");
        contentType.put("jpf" , "image/jp2");
        contentType.put("jpg" , "image/jpeg");
        contentType.put("jpr" , "application/x-jbuilder-project");
        contentType.put("jpx" , "image/jp2");
        contentType.put("js" , "application/javascript");
        contentType.put("json" , "application/json");
        contentType.put("jsonp" , "application/jsonp");
        contentType.put("k25" , "image/x-kodak-k25");
        contentType.put("kar" , "audio/midi");
        contentType.put("karbon" , "application/x-karbon");
        contentType.put("kdc" , "image/x-kodak-kdc");
        contentType.put("kdelnk" , "application/x-desktop");
        contentType.put("kexi" , "application/x-kexiproject-sqlite3");
        contentType.put("kexic" , "application/x-kexi-connectiondata");
        contentType.put("kexis" , "application/x-kexiproject-shortcut");
        contentType.put("kfo" , "application/x-kformula");
        contentType.put("kil" , "application/x-killustrator");
        contentType.put("kino" , "application/smil");
        contentType.put("kml" , "application/vnd.google-earth.kml+xml");
        contentType.put("kmz" , "application/vnd.google-earth.kmz");
        contentType.put("kon" , "application/x-kontour");
        contentType.put("kpm" , "application/x-kpovmodeler");
        contentType.put("kpr" , "application/x-kpresenter");
        contentType.put("kpt" , "application/x-kpresenter");
        contentType.put("kra" , "application/x-krita");
        contentType.put("ksp" , "application/x-kspread");
        contentType.put("kud" , "application/x-kugar");
        contentType.put("kwd" , "application/x-kword");
        contentType.put("kwt" , "application/x-kword");
        contentType.put("la" , "application/x-shared-library-la");
        contentType.put("latex" , "text/x-tex");
        contentType.put("ldif" , "text/x-ldif");
        contentType.put("lha" , "application/x-lha");
        contentType.put("lhs" , "text/x-literate-haskell");
        contentType.put("lhz" , "application/x-lhz");
        contentType.put("log" , "text/x-log");
        contentType.put("ltx" , "text/x-tex");
        contentType.put("lua" , "text/x-lua");
        contentType.put("lwo" , "image/x-lwo");
        contentType.put("lwob" , "image/x-lwo");
        contentType.put("lws" , "image/x-lws");
        contentType.put("ly" , "text/x-lilypond");
        contentType.put("lyx" , "application/x-lyx");
        contentType.put("lz" , "application/x-lzip");
        contentType.put("lzh" , "application/x-lha");
        contentType.put("lzma" , "application/x-lzma");
        contentType.put("lzo" , "application/x-lzop");
        contentType.put("m" , "text/x-matlab");
        contentType.put("m15" , "audio/x-mod");
        contentType.put("m2t" , "video/mpeg");
        contentType.put("m3u" , "audio/x-mpegurl");
        contentType.put("m3u8" , "audio/x-mpegurl");
        contentType.put("m4" , "application/x-m4");
        contentType.put("m4a" , "audio/mp4");
        contentType.put("m4b" , "audio/x-m4b");
        contentType.put("m4v" , "video/mp4");
        contentType.put("mab" , "application/x-markaby");
        contentType.put("man" , "application/x-troff-man");
        contentType.put("mbox" , "application/mbox");
        contentType.put("md" , "application/x-genesis-rom");
        contentType.put("mdb" , "application/vnd.ms-access");
        contentType.put("mdi" , "image/vnd.ms-modi");
        contentType.put("me" , "text/x-troff-me");
        contentType.put("med" , "audio/x-mod");
        contentType.put("metalink" , "application/metalink+xml");
        contentType.put("mgp" , "application/x-magicpoint");
        contentType.put("mid" , "audio/midi");
        contentType.put("midi" , "audio/midi");
        contentType.put("mif" , "application/x-mif");
        contentType.put("minipsf" , "audio/x-minipsf");
        contentType.put("mka" , "audio/x-matroska");
        contentType.put("mkv" , "video/x-matroska");
        contentType.put("ml" , "text/x-ocaml");
        contentType.put("mli" , "text/x-ocaml");
        contentType.put("mm" , "text/x-troff-mm");
        contentType.put("mmf" , "application/x-smaf");
        contentType.put("mml" , "text/mathml");
        contentType.put("mng" , "video/x-mng");
        contentType.put("mo" , "application/x-gettext-translation");
        contentType.put("mo3" , "audio/x-mo3");
        contentType.put("moc" , "text/x-moc");
        contentType.put("mod" , "audio/x-mod");
        contentType.put("mof" , "text/x-mof");
        contentType.put("moov" , "video/quicktime");
        contentType.put("mov" , "video/quicktime");
        contentType.put("movie" , "video/x-sgi-movie");
        contentType.put("mp+" , "audio/x-musepack");
        contentType.put("mp2" , "video/mpeg");
        contentType.put("mp3" , "audio/mpeg");
        contentType.put("mp4" , "video/mp4");
        contentType.put("mpc" , "audio/x-musepack");
        contentType.put("mpe" , "video/mpeg");
        contentType.put("mpeg" , "video/mpeg");
        contentType.put("mpg" , "video/mpeg");
        contentType.put("mpga" , "audio/mpeg");
        contentType.put("mpp" , "audio/x-musepack");
        contentType.put("mrl" , "text/x-mrml");
        contentType.put("mrml" , "text/x-mrml");
        contentType.put("mrw" , "image/x-minolta-mrw");
        contentType.put("ms" , "text/x-troff-ms");
        contentType.put("msi" , "application/x-msi");
        contentType.put("msod" , "image/x-msod");
        contentType.put("msx" , "application/x-msx-rom");
        contentType.put("mtm" , "audio/x-mod");
        contentType.put("mup" , "text/x-mup");
        contentType.put("mxf" , "application/mxf");
        contentType.put("n64" , "application/x-n64-rom");
        contentType.put("nb" , "application/mathematica");
        contentType.put("nc" , "application/x-netcdf");
        contentType.put("nds" , "application/x-nintendo-ds-rom");
        contentType.put("nef" , "image/x-nikon-nef");
        contentType.put("nes" , "application/x-nes-rom");
        contentType.put("nfo" , "text/x-nfo");
        contentType.put("not" , "text/x-mup");
        contentType.put("nsc" , "application/x-netshow-channel");
        contentType.put("nsv" , "video/x-nsv");
        contentType.put("o" , "application/x-object");
        contentType.put("obj" , "application/x-tgif");
        contentType.put("ocl" , "text/x-ocl");
        contentType.put("oda" , "application/oda");
        contentType.put("odb" , "application/vnd.oasis.opendocument.database");
        contentType.put("odc" , "application/vnd.oasis.opendocument.chart");
        contentType.put("odf" , "application/vnd.oasis.opendocument.formula");
        contentType.put("odg" , "application/vnd.oasis.opendocument.graphics");
        contentType.put("odi" , "application/vnd.oasis.opendocument.image");
        contentType.put("odm" , "application/vnd.oasis.opendocument.text-master");
        contentType.put("odp" , "application/vnd.oasis.opendocument.presentation");
        contentType.put("ods" , "application/vnd.oasis.opendocument.spreadsheet");
        contentType.put("odt" , "application/vnd.oasis.opendocument.text");
        contentType.put("oga" , "audio/ogg");
        contentType.put("ogg" , "video/x-theora+ogg");
        contentType.put("ogm" , "video/x-ogm+ogg");
        contentType.put("ogv" , "video/ogg");
        contentType.put("ogx" , "application/ogg");
        contentType.put("old" , "application/x-trash");
        contentType.put("oleo" , "application/x-oleo");
        contentType.put("opml" , "text/x-opml+xml");
        contentType.put("ora" , "image/openraster");
        contentType.put("orf" , "image/x-olympus-orf");
        contentType.put("otc" , "application/vnd.oasis.opendocument.chart-template");
        contentType.put("otf" , "application/x-font-otf");
        contentType.put("otg" , "application/vnd.oasis.opendocument.graphics-template");
        contentType.put("oth" , "application/vnd.oasis.opendocument.text-web");
        contentType.put("otp" , "application/vnd.oasis.opendocument.presentation-template");
        contentType.put("ots" , "application/vnd.oasis.opendocument.spreadsheet-template");
        contentType.put("ott" , "application/vnd.oasis.opendocument.text-template");
        contentType.put("owl" , "application/rdf+xml");
        contentType.put("oxt" , "application/vnd.openofficeorg.extension");
        contentType.put("p" , "text/x-pascal");
        contentType.put("p10" , "application/pkcs10");
        contentType.put("p12" , "application/x-pkcs12");
        contentType.put("p7b" , "application/x-pkcs7-certificates");
        contentType.put("p7s" , "application/pkcs7-signature");
        contentType.put("pack" , "application/x-java-pack200");
        contentType.put("pak" , "application/x-pak");
        contentType.put("par2" , "application/x-par2");
        contentType.put("pas" , "text/x-pascal");
        contentType.put("patch" , "text/x-patch");
        contentType.put("pbm" , "image/x-portable-bitmap");
        contentType.put("pcd" , "image/x-photo-cd");
        contentType.put("pcf" , "application/x-cisco-vpn-settings");
        contentType.put("pcf.gz" , "application/x-font-pcf");
        contentType.put("pcf.z" , "application/x-font-pcf");
        contentType.put("pcl" , "application/vnd.hp-pcl");
        contentType.put("pcx" , "image/x-pcx");
        contentType.put("pdb" , "chemical/x-pdb");
        contentType.put("pdc" , "application/x-aportisdoc");
        contentType.put("pdf" , "application/pdf");
        contentType.put("pdf.bz2" , "application/x-bzpdf");
        contentType.put("pdf.gz" , "application/x-gzpdf");
        contentType.put("pef" , "image/x-pentax-pef");
        contentType.put("pem" , "application/x-x509-ca-cert");
        contentType.put("perl" , "application/x-perl");
        contentType.put("pfa" , "application/x-font-type1");
        contentType.put("pfb" , "application/x-font-type1");
        contentType.put("pfx" , "application/x-pkcs12");
        contentType.put("pgm" , "image/x-portable-graymap");
        contentType.put("pgn" , "application/x-chess-pgn");
        contentType.put("pgp" , "application/pgp-encrypted");
        contentType.put("php" , "application/x-php");
        contentType.put("php3" , "application/x-php");
        contentType.put("php4" , "application/x-php");
        contentType.put("pict" , "image/x-pict");
        contentType.put("pict1" , "image/x-pict");
        contentType.put("pict2" , "image/x-pict");
        contentType.put("pickle" , "application/python-pickle");
        contentType.put("pk" , "application/x-tex-pk");
        contentType.put("pkipath" , "application/pkix-pkipath");
        contentType.put("pkr" , "application/pgp-keys");
        contentType.put("pl" , "application/x-perl");
        contentType.put("pla" , "audio/x-iriver-pla");
        contentType.put("pln" , "application/x-planperfect");
        contentType.put("pls" , "audio/x-scpls");
        contentType.put("pm" , "application/x-perl");
        contentType.put("png" , "image/png");
        contentType.put("pnm" , "image/x-portable-anymap");
        contentType.put("pntg" , "image/x-macpaint");
        contentType.put("po" , "text/x-gettext-translation");
        contentType.put("por" , "application/x-spss-por");
        contentType.put("pot" , "text/x-gettext-translation-template");
        contentType.put("ppm" , "image/x-portable-pixmap");
        contentType.put("pps" , "application/vnd.ms-powerpoint");
        contentType.put("ppt" , "application/vnd.ms-powerpoint");
        contentType.put("pptm" , "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        contentType.put("pptx" , "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        contentType.put("ppz" , "application/vnd.ms-powerpoint");
        contentType.put("prc" , "application/x-palm-database");
        contentType.put("ps" , "application/postscript");
        contentType.put("ps.bz2" , "application/x-bzpostscript");
        contentType.put("ps.gz" , "application/x-gzpostscript");
        contentType.put("psd" , "image/vnd.adobe.photoshop");
        contentType.put("psf" , "audio/x-psf");
        contentType.put("psf.gz" , "application/x-gz-font-linux-psf");
        contentType.put("psflib" , "audio/x-psflib");
        contentType.put("psid" , "audio/prs.sid");
        contentType.put("psw" , "application/x-pocket-word");
        contentType.put("pw" , "application/x-pw");
        contentType.put("py" , "text/x-python");
        contentType.put("pyc" , "application/x-python-bytecode");
        contentType.put("pyo" , "application/x-python-bytecode");
        contentType.put("qif" , "image/x-quicktime");
        contentType.put("qt" , "video/quicktime");
        contentType.put("qtif" , "image/x-quicktime");
        contentType.put("qtl" , "application/x-quicktime-media-link");
        contentType.put("qtvr" , "video/quicktime");
        contentType.put("ra" , "audio/vnd.rn-realaudio");
        contentType.put("raf" , "image/x-fuji-raf");
        contentType.put("ram" , "application/ram");
        contentType.put("rar" , "application/x-rar");
        contentType.put("ras" , "image/x-cmu-raster");
        contentType.put("raw" , "image/x-panasonic-raw");
        contentType.put("rax" , "audio/vnd.rn-realaudio");
        contentType.put("rb" , "application/x-ruby");
        contentType.put("rdf" , "application/rdf+xml");
        contentType.put("rdfs" , "application/rdf+xml");
        contentType.put("reg" , "text/x-ms-regedit");
        contentType.put("rej" , "application/x-reject");
        contentType.put("rgb" , "image/x-rgb");
        contentType.put("rle" , "image/rle");
        contentType.put("rm" , "application/vnd.rn-realmedia");
        contentType.put("rmj" , "application/vnd.rn-realmedia");
        contentType.put("rmm" , "application/vnd.rn-realmedia");
        contentType.put("rms" , "application/vnd.rn-realmedia");
        contentType.put("rmvb" , "application/vnd.rn-realmedia");
        contentType.put("rmx" , "application/vnd.rn-realmedia");
        contentType.put("roff" , "text/troff");
        contentType.put("rp" , "image/vnd.rn-realpix");
        contentType.put("rpm" , "application/x-rpm");
        contentType.put("rss" , "application/rss+xml");
        contentType.put("rt" , "text/vnd.rn-realtext");
        contentType.put("rtf" , "application/rtf");
        contentType.put("rtx" , "text/richtext");
        contentType.put("rv" , "video/vnd.rn-realvideo");
        contentType.put("rvx" , "video/vnd.rn-realvideo");
        contentType.put("s3m" , "audio/x-s3m");
        contentType.put("sam" , "application/x-amipro");
        contentType.put("sami" , "application/x-sami");
        contentType.put("sav" , "application/x-spss-sav");
        contentType.put("scm" , "text/x-scheme");
        contentType.put("sda" , "application/vnd.stardivision.draw");
        contentType.put("sdc" , "application/vnd.stardivision.calc");
        contentType.put("sdd" , "application/vnd.stardivision.impress");
        contentType.put("sdp" , "application/sdp");
        contentType.put("sds" , "application/vnd.stardivision.chart");
        contentType.put("sdw" , "application/vnd.stardivision.writer");
        contentType.put("sgf" , "application/x-go-sgf");
        contentType.put("sgi" , "image/x-sgi");
        contentType.put("sgl" , "application/vnd.stardivision.writer");
        contentType.put("sgm" , "text/sgml");
        contentType.put("sgml" , "text/sgml");
        contentType.put("sh" , "application/x-shellscript");
        contentType.put("shar" , "application/x-shar");
        contentType.put("shn" , "application/x-shorten");
        contentType.put("siag" , "application/x-siag");
        contentType.put("sid" , "audio/prs.sid");
        contentType.put("sik" , "application/x-trash");
        contentType.put("sis" , "application/vnd.symbian.install");
        contentType.put("sisx" , "x-epoc/x-sisx-app");
        contentType.put("sit" , "application/x-stuffit");
        contentType.put("siv" , "application/sieve");
        contentType.put("sk" , "image/x-skencil");
        contentType.put("sk1" , "image/x-skencil");
        contentType.put("skr" , "application/pgp-keys");
        contentType.put("slk" , "text/spreadsheet");
        contentType.put("smaf" , "application/x-smaf");
        contentType.put("smc" , "application/x-snes-rom");
        contentType.put("smd" , "application/vnd.stardivision.mail");
        contentType.put("smf" , "application/vnd.stardivision.math");
        contentType.put("smi" , "application/x-sami");
        contentType.put("smil" , "application/smil");
        contentType.put("sml" , "application/smil");
        contentType.put("sms" , "application/x-sms-rom");
        contentType.put("snd" , "audio/basic");
        contentType.put("so" , "application/x-sharedlib");
        contentType.put("spc" , "application/x-pkcs7-certificates");
        contentType.put("spd" , "application/x-font-speedo");
        contentType.put("spec" , "text/x-rpm-spec");
        contentType.put("spl" , "application/x-shockwave-flash");
        contentType.put("spx" , "audio/x-speex");
        contentType.put("sql" , "text/x-sql");
        contentType.put("sr2" , "image/x-sony-sr2");
        contentType.put("src" , "application/x-wais-source");
        contentType.put("srf" , "image/x-sony-srf");
        contentType.put("srt" , "application/x-subrip");
        contentType.put("ssa" , "text/x-ssa");
        contentType.put("stc" , "application/vnd.sun.xml.calc.template");
        contentType.put("std" , "application/vnd.sun.xml.draw.template");
        contentType.put("sti" , "application/vnd.sun.xml.impress.template");
        contentType.put("stm" , "audio/x-stm");
        contentType.put("stw" , "application/vnd.sun.xml.writer.template");
        contentType.put("sty" , "text/x-tex");
        contentType.put("sub" , "text/x-subviewer");
        contentType.put("sun" , "image/x-sun-raster");
        contentType.put("sv4cpio" , "application/x-sv4cpio");
        contentType.put("sv4crc" , "application/x-sv4crc");
        contentType.put("svg" , "image/svg+xml");
        contentType.put("svgz" , "image/svg+xml-compressed");
        contentType.put("swf" , "application/x-shockwave-flash");
        contentType.put("sxc" , "application/vnd.sun.xml.calc");
        contentType.put("sxd" , "application/vnd.sun.xml.draw");
        contentType.put("sxg" , "application/vnd.sun.xml.writer.global");
        contentType.put("sxi" , "application/vnd.sun.xml.impress");
        contentType.put("sxm" , "application/vnd.sun.xml.math");
        contentType.put("sxw" , "application/vnd.sun.xml.writer");
        contentType.put("sylk" , "text/spreadsheet");
        contentType.put("t" , "text/troff");
        contentType.put("t2t" , "text/x-txt2tags");
        contentType.put("tar" , "application/x-tar");
        contentType.put("tar.bz" , "application/x-bzip-compressed-tar");
        contentType.put("tar.bz2" , "application/x-bzip-compressed-tar");
        contentType.put("tar.gz" , "application/x-compressed-tar");
        contentType.put("tar.lzma" , "application/x-lzma-compressed-tar");
        contentType.put("tar.lzo" , "application/x-tzo");
        contentType.put("tar.xz" , "application/x-xz-compressed-tar");
        contentType.put("tar.z" , "application/x-tarz");
        contentType.put("tbz" , "application/x-bzip-compressed-tar");
        contentType.put("tbz2" , "application/x-bzip-compressed-tar");
        contentType.put("tcl" , "text/x-tcl");
        contentType.put("tex" , "text/x-tex");
        contentType.put("texi" , "text/x-texinfo");
        contentType.put("texinfo" , "text/x-texinfo");
        contentType.put("tga" , "image/x-tga");
        contentType.put("tgz" , "application/x-compressed-tar");
        contentType.put("theme" , "application/x-theme");
        contentType.put("themepack" , "application/x-windows-themepack");
        contentType.put("tif" , "image/tiff");
        contentType.put("tiff" , "image/tiff");
        contentType.put("tk" , "text/x-tcl");
        contentType.put("tlz" , "application/x-lzma-compressed-tar");
        contentType.put("tnef" , "application/vnd.ms-tnef");
        contentType.put("tnf" , "application/vnd.ms-tnef");
        contentType.put("toc" , "application/x-cdrdao-toc");
        contentType.put("torrent" , "application/x-bittorrent");
        contentType.put("tpic" , "image/x-tga");
        contentType.put("tr" , "text/troff");
        contentType.put("ts" , "application/x-linguist");
        contentType.put("tsv" , "text/tab-separated-values");
        contentType.put("tta" , "audio/x-tta");
        contentType.put("ttc" , "application/x-font-ttf");
        contentType.put("ttf" , "application/x-font-ttf");
        contentType.put("ttx" , "application/x-font-ttx");
        contentType.put("txt" , "text/plain");
        contentType.put("txz" , "application/x-xz-compressed-tar");
        contentType.put("tzo" , "application/x-tzo");
        contentType.put("ufraw" , "application/x-ufraw");
        contentType.put("ui" , "application/x-designer");
        contentType.put("uil" , "text/x-uil");
        contentType.put("ult" , "audio/x-mod");
        contentType.put("uni" , "audio/x-mod");
        contentType.put("uri" , "text/x-uri");
        contentType.put("url" , "text/x-uri");
        contentType.put("ustar" , "application/x-ustar");
        contentType.put("vala" , "text/x-vala");
        contentType.put("vapi" , "text/x-vala");
        contentType.put("vcf" , "text/directory");
        contentType.put("vcs" , "text/calendar");
        contentType.put("vct" , "text/directory");
        contentType.put("vda" , "image/x-tga");
        contentType.put("vhd" , "text/x-vhdl");
        contentType.put("vhdl" , "text/x-vhdl");
        contentType.put("viv" , "video/vivo");
        contentType.put("vivo" , "video/vivo");
        contentType.put("vlc" , "audio/x-mpegurl");
        contentType.put("vob" , "video/mpeg");
        contentType.put("voc" , "audio/x-voc");
        contentType.put("vor" , "application/vnd.stardivision.writer");
        contentType.put("vst" , "image/x-tga");
        contentType.put("wav" , "audio/x-wav");
        contentType.put("wax" , "audio/x-ms-asx");
        contentType.put("wb1" , "application/x-quattropro");
        contentType.put("wb2" , "application/x-quattropro");
        contentType.put("wb3" , "application/x-quattropro");
        contentType.put("wbmp" , "image/vnd.wap.wbmp");
        contentType.put("wcm" , "application/vnd.ms-works");
        contentType.put("wdb" , "application/vnd.ms-works");
        contentType.put("webm" , "video/webm");
        contentType.put("wk1" , "application/vnd.lotus-1-2-3");
        contentType.put("wk3" , "application/vnd.lotus-1-2-3");
        contentType.put("wk4" , "application/vnd.lotus-1-2-3");
        contentType.put("wks" , "application/vnd.ms-works");
        contentType.put("wma" , "audio/x-ms-wma");
        contentType.put("wmf" , "image/x-wmf");
        contentType.put("wml" , "text/vnd.wap.wml");
        contentType.put("wmls" , "text/vnd.wap.wmlscript");
        contentType.put("wmv" , "video/x-ms-wmv");
        contentType.put("wmx" , "audio/x-ms-asx");
        contentType.put("wp" , "application/vnd.wordperfect");
        contentType.put("wp4" , "application/vnd.wordperfect");
        contentType.put("wp5" , "application/vnd.wordperfect");
        contentType.put("wp6" , "application/vnd.wordperfect");
        contentType.put("wpd" , "application/vnd.wordperfect");
        contentType.put("wpg" , "application/x-wpg");
        contentType.put("wpl" , "application/vnd.ms-wpl");
        contentType.put("wpp" , "application/vnd.wordperfect");
        contentType.put("wps" , "application/vnd.ms-works");
        contentType.put("wri" , "application/x-mswrite");
        contentType.put("wrl" , "model/vrml");
        contentType.put("wv" , "audio/x-wavpack");
        contentType.put("wvc" , "audio/x-wavpack-correction");
        contentType.put("wvp" , "audio/x-wavpack");
        contentType.put("wvx" , "audio/x-ms-asx");
        contentType.put("x3f" , "image/x-sigma-x3f");
        contentType.put("xac" , "application/x-gnucash");
        contentType.put("xbel" , "application/x-xbel");
        contentType.put("xbl" , "application/xml");
        contentType.put("xbm" , "image/x-xbitmap");
        contentType.put("xcf" , "image/x-xcf");
        contentType.put("xcf.bz2" , "image/x-compressed-xcf");
        contentType.put("xcf.gz" , "image/x-compressed-xcf");
        contentType.put("xhtml" , "application/xhtml+xml");
        contentType.put("xi" , "audio/x-xi");
        contentType.put("xla" , "application/vnd.ms-excel");
        contentType.put("xlc" , "application/vnd.ms-excel");
        contentType.put("xld" , "application/vnd.ms-excel");
        contentType.put("xlf" , "application/x-xliff");
        contentType.put("xliff" , "application/x-xliff");
        contentType.put("xll" , "application/vnd.ms-excel");
        contentType.put("xlm" , "application/vnd.ms-excel");
        contentType.put("xls" , "application/vnd.ms-excel");
        contentType.put("xlsm" , "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        contentType.put("xlsx" , "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        contentType.put("xlt" , "application/vnd.ms-excel");
        contentType.put("xlw" , "application/vnd.ms-excel");
        contentType.put("xm" , "audio/x-xm");
        contentType.put("xmf" , "audio/x-xmf");
        contentType.put("xmi" , "text/x-xmi");
        contentType.put("xml" , "application/xml");
        contentType.put("xpm" , "image/x-xpixmap");
        contentType.put("xps" , "application/vnd.ms-xpsdocument");
        contentType.put("xsl" , "application/xml");
        contentType.put("xslfo" , "text/x-xslfo");
        contentType.put("xslt" , "application/xml");
        contentType.put("xspf" , "application/xspf+xml");
        contentType.put("xul" , "application/vnd.mozilla.xul+xml");
        contentType.put("xwd" , "image/x-xwindowdump");
        contentType.put("xyz" , "chemical/x-pdb");
        contentType.put("xz" , "application/x-xz");
        contentType.put("w2p" , "application/w2p");
        contentType.put("z" , "application/x-compress");
        contentType.put("zabw" , "application/x-abiword");
        contentType.put("zip" , "application/zip");

    }
}
