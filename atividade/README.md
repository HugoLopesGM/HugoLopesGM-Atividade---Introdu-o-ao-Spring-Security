# HugoLopesGM-Atividade---Introdu-o-ao-Spring-Security

1. Explique com suas palavras o que é Spring Security.
   R:O Spring Security é o framework padrão para adicionar autenticação, autorização e proteção contra ataques cibernéticos em aplicações Java. Ele atua como um "segurança de porta" inteligente, interceptando todas as requisições antes que cheguem à sua API para garantir que apenas usuários permitidos acessem seus recursos.
   
2. Para que serve o método csrf().disable()?
   R:O método csrf().disable() serve para desativar a proteção automática contra ataques do tipo CSRF que o Spring Security traz ativada por padrão.
   
3. Explique o que significa SessionCreationPolicy.STATELESS
   R:O termo STATELESS significa literalmente "sem estado". Quando você configura o SessionCreationPolicy.STATELESS no Spring Security, você está dando uma ordem clara ao servidor: "Não crie e não guarde nenhuma sessão do usuário na memória".

4. Qual a função do permitAll()?
   R:O método permitAll() serve para liberar o acesso público a um determinado endpoint (URL) ou rota da sua aplicação.

5. Explique o que faz o requestMatchers().
  R:O método requestMatchers() funciona como a triagem do seu esquema de segurança. A função dele é simplesmente filtrar e apontar quais requisições (URLs e métodos HTTP) vão receber uma determinada regra.

6. Qual a função do anyRequest().authenticated()?
 R: O método anyRequest().authenticated() funciona como a rede de segurança ou a regra de ouro final na sua configuração do Spring Security.

7. O que é uma API Stateless?
   R: Uma API Stateless (Sem Estado) é aquela em que o servidor não guarda nenhuma informação sobre a sessão ou o histórico do usuário entre as requisições.

8. Explique o que a lambda abaixo faz: session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
  R:Essa expressão lambda é o comando prático que configura o Spring Security para trabalhar no modelo Stateless (sem estado/sem sessão) que conversamos na pergunta anterior.
