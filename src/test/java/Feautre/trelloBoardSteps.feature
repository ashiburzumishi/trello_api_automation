Feature: Create Board And Remove Board
  @BoardStep
  Scenario: Create Board and Card, Update Card and Remove Card and Remove Board
    Given user creates a board
    When user creates two cards
    When user updates card by randomly
    When user deletes cards
    When user deletes board
