# Chroma

![app banner](banner.png)

Chroma is a [chromatic tuner](https://en.wikipedia.org/wiki/Chromatic_scale), the perfect app to help you tune your musical instruments with precision and elegance.

Features:
* Basic and complete UI modes
* Noise suppressor
* Letter (A B C) and Solfege (Do Re Mi) notations
* Sharp (♯) and Flat (♭) semitones
* Tuning precision (from 0 to -5/+5 cents)
* Many available pitch detection algorithms (powered by [TarsosDSP](https://github.com/JorenSix/TarsosDSP/)):
    * [YIN](http://audition.ens.fr/adc/pdf/2002_JASA_YIN.pdf)
    * [FFT YIN (Fast Fourier Transform)](https://en.wikipedia.org/wiki/Fast_Fourier_transform)
    * [MPM (McLeod Pitch Method)](http://miracle.otago.ac.nz/tartini/papers/A_Smarter_Way_to_Find_Pitch.pdf)
    * [AMDF (Average Magnitude Difference Function)](https://ieeexplore.ieee.org/abstract/document/1162598)
    * [DYWA (Dynamic Wavelet)](https://pdfs.semanticscholar.org/1ecf/ae4b3618f92b4267912afbc59e3a3ea1d846.pdf)

[![download app button](https://play.google.com/intl/en_us/badges/images/badge_new.png)](https://play.google.com/store/apps/details?id=cafe.adriel.chroma)

## Screenshots

![app screenshots](screenshots.png)

## Build and Gradle setup

This project currently uses Android Gradle Plugin 7.0.2 and Gradle 7.2. To sync and build successfully:

- Run Gradle with JDK 11.
  - Android Studio: Settings > Build, Execution, Deployment > Gradle > Gradle JDK → select JDK 11 (you can download one from the dialog).
  - Command line: set JAVA_HOME to JDK 11 before invoking gradle/gradlew.
- Do not upgrade the Gradle wrapper to 8.x/9.x unless you also plan to upgrade AGP/Kotlin/Compose and dependencies.

Optional convenience:
- Copy gradle.properties.example to one of these locations and set org.gradle.java.home to your JDK 11 path:
  - %USERPROFILE%\.gradle\gradle.properties (Windows)
  - ~/.gradle/gradle.properties (macOS/Linux)

Verification steps:
- gradlew --stop
- gradlew -v   (should show Java 11)
- gradlew clean assembleDebug

# Chroma

![app banner](banner.png)

Chroma is a [chromatic tuner](https://en.wikipedia.org/wiki/Chromatic_scale), the perfect app to help you tune your musical instruments with precision and elegance.

Features:
* Basic and complete UI modes
* Noise suppressor
* Letter (A B C) and Solfege (Do Re Mi) notations
* Sharp (♯) and Flat (♭) semitones
* Tuning precision (from 0 to -5/+5 cents)
* Many available pitch detection algorithms (powered by [TarsosDSP](https://github.com/JorenSix/TarsosDSP/)):
    * [YIN](http://audition.ens.fr/adc/pdf/2002_JASA_YIN.pdf)
    * [FFT YIN (Fast Fourier Transform)](https://en.wikipedia.org/wiki/Fast_Fourier_transform)
    * [MPM (McLeod Pitch Method)](http://miracle.otago.ac.nz/tartini/papers/A_Smarter_Way_to_Find_Pitch.pdf)
    * [AMDF (Average Magnitude Difference Function)](https://ieeexplore.ieee.org/abstract/document/1162598)
    * [DYWA (Dynamic Wavelet)](https://pdfs.semanticscholar.org/1ecf/ae4b3618f92b4267912afbc59e3a3ea1d846.pdf)

[![download app button](https://play.google.com/intl/en_us/badges/images/badge_new.png)](https://play.google.com/store/apps/details?id=cafe.adriel.chroma)

## Screenshots

![app screenshots](screenshots.png)

## Build and Gradle setup

This project currently uses Android Gradle Plugin 8.x and Gradle 8.x. To sync and build successfully:

- Run Gradle with JDK 17.
  - Android Studio: Settings > Build, Execution, Deployment > Gradle > Gradle JDK → select JDK 17 (you can download one from the dialog).
  - Command line: ensure JAVA_HOME points to a JDK 17.
- The Gradle wrapper in this repo will download a compatible Gradle version automatically.

Optional convenience:
- Copy gradle.properties.example to one of these locations and set org.gradle.java.home to your JDK path if needed:
  - %USERPROFILE%\.gradle\gradle.properties (Windows)
  - ~/.gradle/gradle.properties (macOS/Linux)

Verification steps:
- gradlew --stop
- gradlew -v   (should show Java 17)
- gradlew clean assembleDebug

## Privacy

This app does not include Firebase or Crashlytics. No crash reporting or analytics SDKs are bundled.
