# Hint
- remember to add '_' suffix to every component that use annotations in [AndroidManifest.xml](AndroidAnotationsDemo/app/src/main/AndroidManifest.xml), then click ![bulid](http://brotherjing-images.stor.sinaapp.com/res/build.JPG) to build the project.
- to use Rest, you also need to add ```compile 'org.springframework.android:spring-android-rest-template:2.0.0.M1``` to dependency.
- if you use any JSON converter such as ```GsonHttpMessageConverter``` in your Rest client, add the corresponding dependency in ```build.gradle```