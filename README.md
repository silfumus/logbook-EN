logbook (航海日誌)
--
A utility program written in Java that is used along side Kantai Collection (Kancolle). This is the English translation project of the program written by [@sanae_hirotaka](https://twitter.com/sanae_hirotaka). The original program and its source code is available on the [developer's site](http://kancolle.sanaechan.net/).

#### Main Contributors
* [silfumus](https://github.com/silfumus) -- Original translation work
* [@Zharay](http://twitter.com/Zharay) -- Project contributor
* [@sanae_hirotaka](https://twitter.com/sanae_hirotaka) - Original author

## Downloads
All builds can be found in the releases section.

## Frequently Asked Questions

#### Is this safe?
Logbook only looks at the packets coming into your browser and uses that information to display all information that it can. It **does not** affect the packets in any way.

#### How do I use this?
1. Download the [original japanese logbook] (http://kancolle.sanaechan.net/) for your platform (e.g: win-x86, macosx-x64) and unzip to a folder.
2. Overwrite logbook.jar file inside the folder with the one provided here. *If you encounter problem such as ship names still in Japanese, please delete the config folder.*
3. logbook requires you to connect to Kancolle through an internal proxy server hosted by logbook. You may do this by:
  * Set up manually; Please configure your browser/client to use **localhost** and port **8888** (default) as the proxy. Note that it may interfere with other internet activities, thus you are advised to use the PAC file to configure your proxy settings.
  * Through logbook's PAC file generator. Visual guide: [IE/Chrome/Flash Projector] (http://kancolle.sanaechan.net/proxyie.html), [Firefox] (http://kancolle.sanaechan.net/proxyfx.html).
    - Open logbook
    - Other >> PAC File Generator
	- Input your Kancolle server IP in the provided column.
    - Click "Save as..." and store it on a folder.
	- Copy the PAC File Path and paste it on your browser/client's proxy settings.
4. If done correctly, it will automatically pick up information as soon as you visit the Kancolle main menu.

#### Why can't i use the PAC file on Internet Explorer 11?
See [this] (http://blogs.msdn.com/b/ieinternals/archive/2013/10/11/web-proxy-configuration-and-ie11-changes.aspx). There are several workaround, which is:
- Hosting the pac file on the internet (e.g: puu.sh), or
- Applying registry tweak.

#### What's -insert Kancolle server here- IP address?
**Server Name : IP Address**
01. 横須賀鎮守府 203.104.105.167
02. 呉鎮守府 125.6.184.15
03. 佐世保鎮守府 125.6.184.16
04. 舞鶴鎮守府 125.6.187.205
05. 大湊警備府 125.6.187.229
06. トラック泊地 125.6.187.253
07. リンガ泊地 125.6.188.25
08. ラバウル基地 203.104.248.135
09. ショートランド泊地 125.6.189.7
10. ブイン基地 125.6.189.39
11. タウイタウイ泊地 125.6.189.71
12. パラオ泊地 125.6.189.103
13. ブルネイ泊地 125.6.189.135
14. 単冠湾泊地 125.6.189.167
15. 幌筵泊地 125.6.189.215
16. 宿毛湾泊地 125.6.189.247
17. 鹿屋基地 203.104.209.23

#### A ship/item/quest is missing a translation!
Please report them to on [GitHub](https://github.com/silfumus/logbook-EN/issues) or complain on /jp/.