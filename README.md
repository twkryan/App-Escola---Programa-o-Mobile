# StartApp - Gerenciamento de Estacionamento 🚗📱

O **StartApp** é um aplicativo Android desenvolvido em Kotlin como parte do curso de Programação Mobile da ETEC. O projeto combina um sistema de autenticação de usuários com uma interface intuitiva voltada para o controle e monitoramento de vagas de estacionamento em tempo real.

---

## 🚀 Funcionalidades

* **Autenticação Segura:** Tela de Login integrada com validação de campos vazios e credenciais básicas.
* **Cadastro de Usuários:** Fluxo de navegação para registro de novos usuários no sistema.
* **Painel de Controle Administrativo:**
  * Visualização de **Vagas Livres** e **Vagas Ocupadas**.
  * Registro de **Entrada** e **Saída** de veículos.
  * Acesso ao **Histórico** geral de movimentações do estacionamento.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** [Kotlin](https://kotlinlang.org/)
* **Ambiente de Desenvolvimento:** [Android Studio](https://developer.android.com/studio)
* **Design de Interface:** XML com `ConstraintLayout` para layouts responsivos e fluidos.
* **Componentes Android:** `Activities`, `Intents` para navegação e `Toasts` para feedbacks rápidos ao usuário.

---

## 📱 Demonstração do Fluxo de Telas

1. **Tela de Login (`MainActivity`):** * Permite acessar o sistema com as credenciais padrão.
   * Valida se os campos de e-mail e senha foram preenchidos.
   * Redireciona para a tela de Cadastro caso o usuário não possua conta.
2. **Painel de Controle (`PainelActivity`):**
   * Centraliza as ações de gerenciamento de vagas e fluxo de veículos.

> **Nota de Teste:** Para acessar o painel diretamente na versão atual, utilize as seguintes credenciais:
> * **E-mail:** `ryan@email.com`
> * **Senha:** `123`

---

## 🔧 Como Executar o Projeto

Para clonar e executar este aplicativo em sua máquina local, você precisará do [Git](https://git-scm.com) e do [Android Studio](https://developer.android.com/studio) instalados.

```bash
# 1. Clone este repositório
$ git clone [https://github.com/twkryan/App-Escola---Programa-o-Mobile.git](https://github.com/twkryan/App-Escola---Programa-o-Mobile.git)

# 2. Abra o Android Studio
# 3. Selecione "Open an Existing Project" e escolha a pasta clonada
# 4. Aguarde a sincronização do Gradle
# 5. Execute no seu Emulador ou dispositivo físico cadastrado
