# pubsub topic
MY_TOPIC="avro-records"

# Cloud Storage Bucket
MY_BUCKET="$GOOGLE_CLOUD_PROJECT""_avro_beam"

# Avro file Cloud Storage output path
AVRO_OUT="$MY_BUCKET/""out/"

# Region for Cloud Pub/Sub and Cloud Dataflow
REGION="us-central1"

# Region for BigQuery
BQ_REGION="US"

# BigQuery dataset name
BQ_DATASET="sales"

# BigQuery table name
`BQ_TABLE=`"`orders`"

# Maximum number of Dataflow workers
NUM_WORKERS=1
