Table "partnership" {
  "partnership_id" varchar [pk, not null]
  "subject" varchar
  "recipient_address" varchar
  "receipt_address" varchar
  "is_sync_reply" varchar
  "is_receipt_requested" varchar
  "is_outbound_sign_required" varchar
  "is_outbound_encrypt_required" varchar
  "is_outbound_compress_required" varchar
  "is_receipt_sign_required" varchar
  "is_inbound_sign_required" varchar
  "is_inbound_encrypt_required" varchar
  "sign_algorithm" varchar
  "encrypt_algorithm" varchar
  "mic_algorithm" varchar
  "as2_from" varchar [not null]
  "as2_to" varchar [not null]
  "encrypt_cert" bytea
  "verify_cert" bytea
  "retries" int4
  "retry_interval" int4
  "is_disabled" varchar [not null]
  "is_hostname_verified" varchar
}

Table "message" {
  "message_id" varchar [not null]
  "message_box" varchar [not null]
  "as2_from" varchar [not null]
  "as2_to" varchar [not null]
  "is_receipt" varchar
  "is_acknowledged" varchar
  "is_receipt_requested" varchar
  "receipt_url" varchar
  "mic_value" varchar
  "original_message_id" varchar
  "time_stamp" timestamp [not null]
  "principal_id" varchar
  "status" varchar [not null]
  "status_desc" varchar

Indexes {
  (message_id, message_box) [pk]
}
}

Table "repository" {
  "message_id" varchar [not null]
  "message_box" varchar [not null]
  "content" bytea [not null]

Indexes {
  (message_id, message_box) [pk]
}
}
