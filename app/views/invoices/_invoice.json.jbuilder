json.extract! invoice, :id, :xml_original, :xml_signed, :created_at, :updated_at
json.url invoice_url(invoice, format: :json)
