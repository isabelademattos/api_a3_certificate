class CreateInvoices < ActiveRecord::Migration[5.0]
  def change
    create_table :invoices do |t|
      t.text :xml_original
      t.text :xml_signed

      t.timestamps
    end
  end
end
