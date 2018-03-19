# sprak-framework-with-kotlin-demo


## Directory structure

```bash
.
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    └── main
        ├── frontend   ----------------> Frontend environment (Hyperapp & Webpack)
        │   ├── dist
        │   │   └── bundle.js
        │   ├── package.json
        │   ├── src
        │   │   └── app.js
        │   ├── webpack.config.js
        │   └── yarn.lock
        ├── kotlin   ------------------> Kotlin Web Server with Apache Spark Framework
        │   ├── Main.kt
        │   └── SparkConfigure.kt
        └── resources   ---------------> Resources
            ├── public          |-------- public dir
            │   └── style.css   |
            └── templates       |-------- view dir ( Server Side Rendering )
                └── index.jade
```
