Table order {
  id int 
  process_instance_id varchar
  current_task varchar
  ecl_numero varchar
  ecl_data datetime
  cliente_id int
  fornecedor_id int
  fornecedor_classificacao varchar
  fornecedor_qualificado bool
  ecf_numero varchar
  ecf_data datetime
  produtos produto 
  imagens base64 
  recebido_em datetime
  recebido_por varchar
  embalagem_ok bool
  documentacao_ok bool
  observacoes varchar
  is_finalizado bool
}

Table produto {
  id int 
  nome_produto varchar
  tipo_produto varchar
}