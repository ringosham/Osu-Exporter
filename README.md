# Osu! Exporter
A simple utility for exporting all songs and beatmaps (in .osz form) with a single click from your osu! library.

I find it funny that most of these utility software I found in Github either don't work or lacking in features. So I decided to make one myself!
## Disclaimer
This program only copies, as well as converting songs that are already stored the user's computer. The copied and converted files are stored in the user's device only. These songs are intended for personal use only. The user, however, is allowed to do anything with the files under the confines of copyright laws. The author of this program cannot prevent the user from performing any copyright infringing actions. Therefore, in no event shall the author be liable for any copyright infringement claims. The user is the only one liable for such actions.

This program, although requires the rhythm game "Osu!" to function, it is not affiliated with the person/company developed the game.

In short,

Do not use this program for distributing songs illegally. The creator of this program is not responsible for such actions performed by the user of the program. 
## Features
* Export all beatmaps as .osz or just the songs
* Proper file renaming (or rename it after beatmap ID if you really want to)
* Adding MP3 tags based on beatmap info
* Filter practice songs
* **Filter any similar songs with the same names to prevent duplicates** (Extremely useful for saving space and if you have a large amount of beatmaps) 
* Conversion from ogg to mp3 (Conversion is done via FFmpeg, included in the program)
* Attempt to fix encoding to old mp3 tags (Very old mp3s don't use UTF-8, which is why the song shows up as "????" in your music player. A corrupted ID3 tag will also cause this issue.)

The above features are fully configurable!
## Compiling
Just compile it with Intellij. That's it.

## Download
Go to the [release](https://github.com/ringosham/Osu-Exporter/releases) tab.

## Things to note
Depending on how many beatmaps you have, the process may take from less than 30 seconds to more than 5 minutes.

This program is only tested in Windows 64-bit, but it should work on all operating systems.

The FFmpeg binary is only 32-bit in Linux and macOS. Please make sure you have the dependencies for conversion.
## License
```
Copyright © 2018 Ringosham
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ```
## Dependencies

[Jave](http://www.sauronsoftware.it/projects/jave/index.php) - Java Audio Video Encoder, also a wrapper for FFmpeg - Under GNU GPL v3 license

[VorbisJava](https://github.com/Gagravarr/VorbisJava) - Ogg and vorbis tools for Java - Under Apache License 2.0

[FFmpeg project](https://ffmpeg.org) - FFmpeg project - Cross platform record, stream, convert video and audio utility - [FFmpeg license](https://ffmpeg.org/legal.html)

[JavaFX AsyncTask](https://github.com/victorlaerte/javafx-asynctask) - AsyncTask in JavaFX - Under Apache License 2.0

[mp3agic](https://github.com/mpatric/mp3agic) - Java library for reading/manipulating ID3 tags - Under MIT License

[Tika parser](https://tika.apache.org) - Content analysis toolkit - Under Apache License 2.0