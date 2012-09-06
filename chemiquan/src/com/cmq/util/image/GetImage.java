package com.cmq.util.image;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import sun.misc.BASE64Decoder;

/**
 * 
 * @author Andrew
 *         <p>
 *         鍒嗙被浼犲叆鐨勪簩浜岃繘鍒舵暟鎹皢鎵?湁鐨勫浘鐗囧垎绂诲嚭鏉ュ瓨鍏ユ枃浠跺す
 *         </p>
 * 
 */
public class GetImage {

	static BASE64Decoder decoder = new sun.misc.BASE64Decoder();
	private static final String tag = "<img\\s+.*?>";
	private IPTimeStamp its = null;
	private LinkedList<String> imgs;
	private LinkedList<String> urls;
	private String imgType;
	private String imgName;

	public  String getImageAddSaveIt(String content_temp, String path,
			String ip) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		Date now = new Date();
		String dir = path + "//uploading//" + sf.format(now);
		
		this.getAndSaveAllImg(tag, content_temp, dir, ip);
		return this.replaceImgByAddress(content_temp);
	}

	/**
	 * 灏嗘枃绔犱腑鐨勫浘鐗囬兘鏇挎崲鎴愬湴鍧?
	 * 
	 * @return String
	 */
	private String replaceImgByAddress(String content_temp) {

		String contents[] = content_temp.split("<img\\s+.*?>");
		if (contents.length > 1) {
			StringBuffer contentBuffer = new StringBuffer(contents[0]);
			for (int i = 1; i < urls.size(); i++) {
				contentBuffer.append("<img src=\"" + urls.get(i - 1) + "\" />"
						+ contents[i]);
			}
			return contentBuffer.toString();
		} else
			return content_temp;

	}

	private LinkedList<String> getAndSaveAllImg(String tag,
			String content_temp, String dir, String ip) {
		// 涓哄懡鍚嶅仛鍑嗗
		its = new IPTimeStamp(ip);
		imgs = new LinkedList<String>();
		urls = new LinkedList<String>();
		// "<img\s+.*?>"鏌ユ壘鍥剧墖鏍囩鐨勬鍒欒〃杈惧紡
		Pattern p = Pattern.compile(tag);// 鍖归厤<title>寮?ご锛?/title>缁撳熬鐨勬枃妗?
		Matcher m = p.matcher(content_temp);// 寮?缂栬瘧
		while (m.find()) {
			imgs.add(m.group(0));// 鑾峰彇琚尮閰嶇殑閮ㄥ垎
		}
		int i = 0;
		for (String img : imgs) {
			//
			File dirs = new File(dir);
			// 鍙栧緱鍥剧墖绫诲瀷鐨勭涓?釜瀛楁瘝
			imgType = img.substring(28, 29);
			String str[] = img.split("base64,");
			// 寰楀埌鍥剧墖淇℃伅
			img = str[1].substring(0, str[1].length() - 8);
			// 寤虹珛鐩綍
			dirs.mkdirs();
			if (imgType.equalsIgnoreCase("j")) {
				imgType = "jpg";
			} else if (imgType.equalsIgnoreCase("p")) {
				imgType = "png";
			} else if (imgType.equalsIgnoreCase("g")) {
				imgType = "git";
			} else if (imgType.equalsIgnoreCase("b")) {
				imgType = "bmp";
			}
			// 缁欏浘鐗囧懡鍚?
			imgName = its.getIPTimeRand() + i;
			// 鍌ㄥ瓨鍥剧墖
			base64StringToImage(img, dir + "//" + imgName + "." + imgType);
			urls.add(dir + "//" + imgName + "." + imgType);
			i++;
		}
		return null;
	}

	/**
	 * 灏哠tring杞崲鎴怚mage骞跺瓨鍌ㄥ埌纭洏涓?
	 * 
	 * @param image
	 */
	public static void base64StringToImage(String image, String imgName) {
		try {
			byte[] bytes = decoder.decodeBuffer(image);
			ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
			BufferedImage bi1 = ImageIO.read(bais);
			File file = new File(imgName);// 鍙互鏄痡pg,png,gif鏍煎紡
			ImageIO.write(bi1, "jpg", file);// 涓嶇杈撳嚭浠?箞鏍煎紡鍥剧墖锛屾澶勪笉闇?敼鍔?
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
