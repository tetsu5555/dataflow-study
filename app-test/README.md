実行

```
mvn generate-sources

gsutil mb -l $REGION -c regional gs://$MY_BUCKET

. ./env.sh

mvn compile exec:java -Dexec.mainClass=apptest.App -Dexec.cleanupDaemonThreads=false -Dexec.args=" \
    --project=$GOOGLE_CLOUD_PROJECT \
    --runner=DataflowRunner \
    --outputLocation=gs://$MY_BUCKET/counts/ \
    --gcpTempLocation=gs://$MY_BUCKET/temp/"
```
