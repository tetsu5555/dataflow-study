ビルド & 実行

```
mvn package
java -cp target/test-1.0-SNAPSHOT.jar test.App
```

```
mvn compile exec:java -Dexec.mainClass=test.App
```

```
mvn site
```

```
mvn compile exec:java -Dexec.mainClass=apptest.App -Dexec.cleanupDaemonThreads=false -Dexec.args=" \
    --project=$GOOGLE_CLOUD_PROJECT \
    --runner=DataflowRunner \
    --outputLocation=gs://$MY_BUCKET/counts/ \
    --gcpTempLocation=gs://$MY_BUCKET/temp/"
  ```