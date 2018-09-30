ALTER TABLE "task$borrowings" DROP COLUMN "amount";
ALTER TABLE "task$borrowings" ADD "amount" INT NULL;
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '578abfd2-a53c-499f-a4dc-5c93dfb15644', 
"attribute_name" = 'Amount', 
"column_name" = 'amount', 
"type" = 3, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '1f8e7e11-b774-4669-84a2-8a9a5470c701';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.1', 
"lastsyncdate" = '20180706 19:43:45';
